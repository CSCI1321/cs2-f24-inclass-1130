package cs2.adt;

public class ArrayQueue<T> implements Queue<T> {
  private T[] arr;
  private int len;
  private int beg;

  public ArrayQueue() {
    arr = (T[])new Object[10];
    len = 0;
    beg = 0;
  }
  
  public void enqueue(T elem) {
    if(len == arr.length) {
      T[] tmp = (T[]) new Object[len*2];
      for(int i=0; i<len; i++) {
        tmp[i] = arr[(beg + i) % arr.length];
      }
      arr = tmp;
      beg = 0;
    }
    arr[(beg + len) % arr.length] = elem;
    len++;
  }
  public T dequeue() {
    T retVal = arr[beg];
    len--;
    beg = (beg + 1) % arr.length;
    return retVal;
  }
  public T peek() {
    return arr[beg];
  }
  public boolean isEmpty() {
    return len == 0;
  }

}
