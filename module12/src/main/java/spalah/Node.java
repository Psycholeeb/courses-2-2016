package spalah;

/**
 * Created by Татьяна on 21.08.2016.
 */
public class Node<T> {
    private Node<T> next;
    private T value;

    public Node(Node<T> next) {
        this.next = next;
        value = null;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
