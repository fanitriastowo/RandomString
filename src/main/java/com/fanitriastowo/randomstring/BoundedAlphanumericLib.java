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
public class BoundedAlphanumericLib {

  public static void main(String[] args) {
    String generatedString = RandomStringUtils.randomAlphanumeric(10);

    System.out.println(generatedString);
  }

}
