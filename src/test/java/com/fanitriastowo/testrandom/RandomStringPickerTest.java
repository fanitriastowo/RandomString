/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanitriastowo.testrandom;

import com.fanitriastowo.randomstring.helper.RandomStringPicker;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author triastowo
 */
public class RandomStringPickerTest {

  @Test
  public void testPickString() {
    List<String> list = new ArrayList<>();
    list.add("fabulous");
    list.add("awesome");
    list.add("neat");
    list.add("lit");

    RandomStringPicker picker = new RandomStringPicker(list);
    String result = picker.pick();
    
    Assertions.assertNotNull(list);
  }
}
