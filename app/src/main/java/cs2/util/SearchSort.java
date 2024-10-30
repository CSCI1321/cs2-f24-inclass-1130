package cs2.util;

public class SearchSort {

  static class Student implements Comparable<Student> {
    public String name;
    public double gpa;
    public Student(String n, double g) { name = n; gpa = g; }
    public int compareTo(Student other) {
      return this.name.compareTo(other.name);
      //if(this.gpa < other.gpa) return -1;
      //if(this.gpa > other.gpa) return 1;
      //return 0;
    }
  }
  public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
    for(int i=0; i<arr.length; i++) {
      for(int j=0; j<arr.length-1-i; j++) {
        if(arr[j].compareTo(arr[j+1]) > 0) {
          T tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
        }
      }
    }
  }
  public static void main(String[] args) {
    Student[] t = { new Student("Sally", 4.0),
                    new Student("BillyBob", 3.2),
                    new Student("Tracy", 3.7) };
    bubbleSort(t);
    for(Student x : t) { System.out.print(x.name + ","); }
    System.out.println();

    Integer[] a = { 5, 2, 3, 6, -2, 21, 4 };
    bubbleSort(a);
    for(int x : a) { System.out.print(x + ","); }
    System.out.println();

    String[] s = { "Hello", "Apple", "Goodbye", "Whatever" };
    bubbleSort(s);
    for(String x : s) { System.out.print(x + ","); }
    System.out.println();
  }

}
