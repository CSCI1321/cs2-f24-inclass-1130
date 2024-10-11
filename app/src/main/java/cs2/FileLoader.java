package cs2;

import java.io.File;
import java.util.Scanner;

public class FileLoader {
  public static void main(String[] args) {
     
    try {
      File f = new File("SomeFile.txt");
      Scanner sc = new Scanner(f);
      System.out.println(sc.nextLine());
    } catch(Exception e) {
      System.out.println("ERROR happened");
      e.printStackTrace();
    }
    

  }
}
