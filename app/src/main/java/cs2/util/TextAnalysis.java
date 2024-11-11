package cs2.util;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TextAnalysis {
    public static HashSet<String> getWords(String filename) {
      HashSet<String> words = new HashSet<>();
      try {
        File f = new File(filename);
        Scanner scan = new Scanner(f);
        while(scan.hasNextLine()) {
          String line = scan.nextLine().toLowerCase();
          String[] parts = line.split("\\s+");
          for(int i=0; i<parts.length; i++) {
            parts[i] = parts[i].replaceAll("[^A-Za-z]", "");
            words.add(parts[i]);
          }
        }

      } catch (Exception e) {
        e.printStackTrace();
      }
      //System.out.println(words);
      //System.out.println(words.size());
      return words;
    }

    public static HashMap<String,Integer> getWordCounts(String filename) {
      HashMap<String,Integer> words = new HashMap<>();
      try {
        File f = new File(filename);
        Scanner scan = new Scanner(f);
        while(scan.hasNextLine()) {
          String line = scan.nextLine().toLowerCase();
          String[] parts = line.split("\\s+");
          for(int i=0; i<parts.length; i++) {
            parts[i] = parts[i].replaceAll("[^A-Za-z]", "");
            
            if(!words.containsKey(parts[i])) {
              words.put(parts[i], 1);
            } else {
              words.put(parts[i], 1 + words.get(parts[i]));
            }

          }
        }

      } catch (Exception e) {
        e.printStackTrace();
      }
      return words;
    }


    public static void main(String[] args) {
      HashSet<String> tSet = getWords("tempest.txt");
      HashSet<String> mSet = getWords("midsummer.txt");
      System.out.println(tSet.size());
      System.out.println(mSet.size());

      tSet.removeAll(mSet);
      System.out.println(tSet);

      HashMap<String, Integer> tMap = getWordCounts("tempest.txt");
      System.out.println(tMap.size());
      System.out.println(tMap);

      for(String k : tMap.keySet()) {
        int count = tMap.get(k);
        if(count > 100) {
          System.out.println(k + " -- " + count);
        }
      }

    }



}
