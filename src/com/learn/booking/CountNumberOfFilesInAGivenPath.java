package com.learn.booking;

import java.io.File;

public class CountNumberOfFilesInAGivenPath {
  public static void main(String[] args){
    File file=new File("/Users/m0k00hw/Documents/PR1/test_suite_case/rx-testsuite-collections/connexus-nextgen/1.0/src/test/resources/e2e-testsuites/work-service/features/v1/v3");
    System.out.println(countFilesInDirectory(file));
  }
  public static int countFilesInDirectory(File directory) {
    int count = 0;
    for (File file : directory.listFiles()) {
      if (file.isFile()) {
        count++;
      }
      if (file.isDirectory()) {
        count += countFilesInDirectory(file);
      }
    }
    return count;
  }
}
