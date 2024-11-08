package cs2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
    System.out.println("Set 1: " + set);
  
    HashSet<String> set2 = new HashSet<>();
    set2.add("Hello");
    set2.add("hello");
    set2.add("Ack!");
    System.out.println("Set 2: " + set2);

    set.retainAll(set2);
    System.out.println(set);
    set.clear();
    System.out.println(set);

    System.out.println(set2);

    Iterator<String> it = set2.iterator();
    while(it.hasNext()) {
      String s = it.next();
      System.out.println(s);
    }
    it = set2.iterator();
    while(it.hasNext()) {
      //String s = it.next();
      System.out.println(it.next());
    }

    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(7);
    al.add(-4);
    System.out.println(al);
    Iterator<Integer> it2 = al.iterator();
    while(it2.hasNext()) {
      System.out.println(it2.next());
    }


  }
}
