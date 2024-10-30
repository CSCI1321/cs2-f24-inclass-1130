package cs2.util;

import java.util.HashSet;

public class Collections {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
    System.out.println(set);

    set.add("Hello");
    set.add("goodbye");
    set.add("Whatever");
    System.out.println(set);
    System.out.println(set.contains("Hello"));
    System.out.println(set.isEmpty());
    System.out.println(set.size());

    for(int i=0; i<set.size(); i++) {
      //System.out.println(set.get(i));
    }

    set.remove("goodbye");
    set.add("Hello");
    set.remove("!!!!");
    System.out.println(set);
  
    set.clear();
    System.out.println(set);


  }
}
