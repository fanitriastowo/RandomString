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
public class BoundedAlphabetLib {

  public static void main(String[] args) {
    String generatedString = RandomStringUtils.randomAlphabetic(10);

    System.out.println(generatedString);
  }

}
