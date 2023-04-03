package linkedList;

public class OwnLL<T> {
    Node<T> last;
    Node<T> first;

    public void add(T obj) {
        if(first == null) {
            first = new Node<>(null, null, obj);
        } else if (last == null) {
            last = new Node<>(first, null, obj);
            first.setNextElement(last);
        } else {
            Node<T> tNode = new Node<>(last, null, obj);
            last.setNextElement(tNode);
            last = tNode;
        }

    }

}
