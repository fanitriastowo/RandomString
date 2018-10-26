/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.randomstring;

import com.fanitriastowo.randomstring.helper.RandomStringPicker;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author triastowo
 */
public class PickRandomFromFileFixed {

  private static final String FILENAME = "./src/main/java/com/fanitriastowo/randomstring/file/dictionary.txt";

  public static void main(String[] args) {
    try {

      List<String> list = Files.readAllLines(Paths.get(FILENAME),
              StandardCharsets.UTF_8);

      RandomStringPicker picker = new RandomStringPicker(list);
      System.out.println(picker.pick());

    } catch (IOException ex) {
      Logger.getLogger(PickRandomFromFileFixed.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
