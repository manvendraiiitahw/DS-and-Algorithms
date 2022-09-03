package com.learn;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalDateTest {
  public static void main(String[] args) {
    LocalDate currentDate = LocalDate.now();
    System.out.println(currentDate);
    LocalDate givenDate = LocalDate.of(2017, 10, 28);
    System.out.println(givenDate);
    System.out.println(currentDate.equals(givenDate));

    /* Comparing the dates given as Strings. Strings are parsed
     * into LocalDate instances and then compared against each other
     */
    LocalDate date1 = LocalDate.parse("2017-10-21");
    System.out.println(date1);
    LocalDate date2 = LocalDate.parse("2017-08-01");
    System.out.println(date1.toEpochDay() - ( date2.toEpochDay()));
//    System.out.println(date2);
//    System.out.println(date1.equals(date2));
    Map<String, List<Integer>> listMap=new HashMap<>(2);
    Map<String, List<Integer>>listMap1=new HashMap<>();
    System.out.println(listMap+" and "+ listMap1.size());
  }
}
