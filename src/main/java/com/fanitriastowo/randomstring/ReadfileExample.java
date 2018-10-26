/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.randomstring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author triastowo
 */
public class ReadfileExample {

  public static void main(String[] args) {
    BufferedReader br = null;
    FileReader fr = null;

    try {
      File file = new File("./src/main/java/com/fanitriastowo/randomstring/file/dictionary.txt");

      fr = new FileReader(file);
      br = new BufferedReader(fr);

      String currentLine;

      while ((currentLine = br.readLine()) != null) {
        System.out.println(currentLine);
      }

    } catch (FileNotFoundException ex) {
      Logger.getLogger(ReadfileExample.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(ReadfileExample.class.getName()).log(Level.SEVERE, null, ex);
    } finally {

      try {
        if (br != null) {
          br.close();
        }
        if (fr != null) {
          fr.close();
        }

      } catch (IOException ex) {
        Logger.getLogger(ReadfileExample.class.getName()).log(Level.SEVERE, null, ex);
      }

    }

  }

}
