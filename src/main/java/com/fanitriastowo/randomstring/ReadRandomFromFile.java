/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.randomstring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author triastowo
 */
public class ReadRandomFromFile {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("./src/main/java/com/fanitriastowo/randomstring/file/dictionary.txt");
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < 1000; ++i) {
      String s = choose(file);
      if (!map.containsKey(s)) {
        map.put(s, 0);
      }
      map.put(s, map.get(s) + 1);
    }

    System.out.println(map);
  }

  public static String choose(File f) throws FileNotFoundException {
    String result = null;
    Random rand = new Random();
    int n = 0;
    for (Scanner sc = new Scanner(f); sc.hasNext();) {
      ++n;
      String line = sc.nextLine();
      if (rand.nextInt(n) == 0) {
        result = line;
      }
    }

    return result;
  }
}
