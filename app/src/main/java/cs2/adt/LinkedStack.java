package cs2.adt;

public class LinkedStack<T> implements Stack<T> {
  private class Node {
    public T data;
    public Node next;
    public Node(T d, Node n) { data=d; next=n; }
  }

  private Node head;

  public void push(T elem) {
    head = new Node(elem, head);
  }
  public T pop() {
    T tmp = head.data;
    head = head.next;
    return tmp;
  }
  public T peek() {
    return head.data;
  }
  public boolean isEmpty() {
    return head == null;
  }
}
