/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package com.tdd;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author MSP5COB
 *
 */
public class TddRange {
  
  public Map<String,Integer> calculateCurrentSampleRanges(List<Integer> currentSamples){
    Map<String,Integer> currentSampleRange = new TreeMap<>();
    if(currentSamples == null || currentSamples.isEmpty()) {
      return currentSampleRange;
    }
    Collections.sort(currentSamples);
    int startValue = currentSamples.get(0);
    int previousValue = currentSamples.get(0);
    int count = 0;
    
    for(Integer currentValue : currentSamples) {
      if((currentValue == previousValue) || (currentValue == previousValue + 1)) {
        count++;
        previousValue = currentValue;
      }
      else {
        currentSampleRange.put(startValue+"-"+previousValue, count);
        startValue = currentValue;
        previousValue = currentValue;
        count = 1;
      }
    }
    currentSampleRange.put(startValue+"-"+previousValue, count);
    return currentSampleRange;
  }

}
