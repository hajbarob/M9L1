package linkedList;

public class Node <T> {

    private Node <T> previousElement;

    private Node <T> nextElement;

    private T currentElement;

    public Node(Node <T> previousElement, Node <T> nextElement, T currentElement) {
        this.previousElement = previousElement;
        this.nextElement = nextElement;
        this.currentElement = currentElement;
    }

    public Node<T> getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(Node<T> previousElement) {
        this.previousElement = previousElement;
    }

    public Node<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<T> nextElement) {
        this.nextElement = nextElement;
    }

    public T getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(T currentElement) {
        this.currentElement = currentElement;
    }
}
