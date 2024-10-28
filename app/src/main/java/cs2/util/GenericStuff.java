package cs2.util;

import java.util.ArrayList;

public class GenericStuff {
  
  public static <T> ArrayList<T> arrayToList(T[] a) {
    ArrayList<T> al = new ArrayList<>();
    for(T i : a) {
      al.add(i);
    }
    return al;
  }

  public static void main(String[] args) {
    Integer[] arr = { 1, 2, 3, 4 };
    System.out.println(arrayToList(arr));
    Double[] arr2 = { 3.141, 2.3, 5.34 };
    System.out.println(arrayToList(arr2)); 
  }

}
