public class MyHashMap<K,V> {
    MyLinkedList<K> myLinked;

    public MyHashMap() {
        this.myLinked = new MyLinkedList<>();
    }

    public V get( K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinked.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add (K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinked.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key,value);
            this.myLinked.append(myMapNode);
        }
        else{
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyHashMapNodes{" + myLinked + "}" ;
    }
}