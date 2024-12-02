package cs2.adt;

public interface Queue<T> {
  public void enqueue(T elem);
  public T dequeue();// throws Exception;
  public T peek();
  public boolean isEmpty();
}
