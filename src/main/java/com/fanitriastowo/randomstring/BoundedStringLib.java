/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.randomstring;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author triastowo
 */
public class BoundedStringLib {

  public static void main(String[] args) {

    int length = 10;
    boolean useLetters = true;
    boolean useNumbers = true;
    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

    System.out.println(generatedString);
  }
}
