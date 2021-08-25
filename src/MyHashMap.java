import java.util.ArrayList;

public class MyHashMap<K,V> {

    private final int numBuckets;
    ArrayList<MyLinkedList<K>> myBucketArray;

    public MyHashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        for(int i=0;i<numBuckets;i++) {
            this.myBucketArray.add(null);
        }

    }

    private int getBucketIndex(K key) {
        int hashcode = Math.abs(key.hashCode());
        int index = hashcode%numBuckets;
        return index;
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        MyLinkedList myLinked = this.myBucketArray.get(index);
        if (myLinked == null) return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) myLinked.search(key);
        return (myMapNode == null)? null:myMapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyLinkedList myLinked = this.myBucketArray.get(index);
        if (myLinked == null) {
            myLinked = new MyLinkedList<>();
            this.myBucketArray.set(index, myLinked);
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) myLinked.search(key);
        if (myMapNode==null) {
            myMapNode = new MyMapNode<>(key,value);
            myLinked.append(myMapNode);
        }
        else {
            myMapNode.setValue(value);
        }

    }

    @Override
    public String toString() {
        return "MyLinkedHashMap List{"+ myBucketArray+"}";
    }
}