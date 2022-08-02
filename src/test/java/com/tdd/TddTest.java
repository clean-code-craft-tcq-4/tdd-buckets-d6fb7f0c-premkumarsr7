/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * @author MSP5COB
 *
 */
public class TddTest {

  @Test
  public void test1() {
    TddRange tddRange = new TddRange();
    List<Integer> currentSamples = new ArrayList<>();   
    currentSamples.add(4);
    currentSamples.add(5);   
    Map<String,Integer> sampleRangesMap = tddRange.calculateCurrentSampleRanges(currentSamples);
    assertNotNull("Output should not be null",sampleRangesMap);
    assertEquals("Number of Readings is wrong for Range ",(Integer)2,sampleRangesMap.get("4-5"));    
  }
  
  
  @Test
  public void test2() {
    TddRange tddRange = new TddRange();
    List<Integer> currentSamples = new ArrayList<>(Arrays.asList(3, 3, 5, 4, 10, 11, 12, 8,89));   
   
    Map<String,Integer> sampleRangesMap = tddRange.calculateCurrentSampleRanges(currentSamples);
    assertNotNull("Output should not be null",sampleRangesMap);
    assertEquals("Number of Readings is wrong for Range ",(Integer)2,sampleRangesMap.get("4-5"));    
  }
  
  @Test
  public void test3() {
    TddRange tddRange = new TddRange();
    List<Integer> currentSamples = new ArrayList<>();
   
    Map<String,Integer> sampleRangesMap = tddRange.calculateCurrentSampleRanges(currentSamples);
    assertNotNull("Output should not be null",sampleRangesMap);
    assertEquals("Number of Readings is wrong for Range ",(Integer)2,sampleRangesMap.get("4-5"));    
  }
}
