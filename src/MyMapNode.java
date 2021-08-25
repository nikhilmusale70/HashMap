public class MyMapNode <K,V> implements INode<K> {
    private K key;
    private V value;
    MyMapNode<K,V> next;

    public MyMapNode(K key,V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public void setNext(INode next) {
        this.next = (MyMapNode<K,V>) next;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public INode getNext() {
        return next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuffer myMapNodeString = new StringBuffer();
        myMapNodeString.append("MyMapNode={K=").append(key).append(",V=").append(value).append("}");
        if (next != null) {
            myMapNodeString.append("->").append(next);
        }
        return myMapNodeString.toString();
    }
}