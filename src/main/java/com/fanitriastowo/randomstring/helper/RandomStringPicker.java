/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.randomstring.helper;

import java.util.List;

/**
 *
 * @author triastowo
 */
public class RandomStringPicker {

  private final List<String> list;

  public RandomStringPicker(List<String> list) {
    this.list = list;
  }

  public String pick() {
    return list.get(pickRandomNumber(list.size()));
  }

  private int pickRandomNumber(int max) {
    return (int) (Math.random() * max);
  }

}
