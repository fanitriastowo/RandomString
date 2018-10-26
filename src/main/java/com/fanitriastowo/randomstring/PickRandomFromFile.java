/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.randomstring;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author triastowo
 */
public class PickRandomFromFile {

  private static final String FILENAME = "./src/main/java/com/fanitriastowo/randomstring/file/dictionary.txt";

  public static void main(String[] args) {

    PickRandomFromFile pick = new PickRandomFromFile();
    pick.init(FILENAME);
  }

  public void init(String fileName) {
    List<String> lines = null;
    try {
      lines = Files.readAllLines(Paths.get(fileName),
              StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.out.println("File can't be opened.");
    }

    int randomWordIndex = getRandomNumber(0, lines.size());
    System.out.println(lines.get(randomWordIndex));
  }

  /**
   * Returns a random number in the range of the specified min and max parameters.
   *
   * @param min the minimum value to return
   * @param max the maximum value to return
   * @return a random number between the specified range
   */
  private int getRandomNumber(int min, int max) {
    return min + (int) (Math.random() * max - min + 1);
  }
}
