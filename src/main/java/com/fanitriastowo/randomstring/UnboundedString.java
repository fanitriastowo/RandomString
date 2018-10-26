/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.randomstring;

import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author triastowo
 */
public class UnboundedString {

  public static void main(String[] args) {

    byte[] array = new byte[7]; // length is bounded by 7
    new Random().nextBytes(array);
    String generatedString = new String(array, Charset.forName("UTF-8"));

    System.out.println(generatedString);

  }
}
