package com.learn.interfac;

import java.util.ArrayList;
import java.util.List;

public class Testing1 {
  public static void main(String[] args) {
    List<Country> countries = new ArrayList<>();
    Country c = new Country(999999999, "India", "ASIA");
    countries.add(c);
    Country c1 = new Country(999999999, "China", "ASIA");
    Country c3 = new Country(999999999, "Pakistan", "ASIA");
    Country c2 = new Country(999999999, "Australia", "Australia");
    countries.add(c1);
    countries.add(c2);
    countries.add(c3);
    int population = 0;
    for (Country c4 : countries) {
      if (c4.getContinent().equalsIgnoreCase("Asia")) {
        population = population + c4.getPopulation();
      }
    }
    System.out.println(population);

    List<Integer> integers=new ArrayList<>();
    System.out.println(integers);
//    for(int i=0;i<1000;i++){
//      integers.add(i);
//      System.out.println(integers.size());
//    }
//
//    for(int i=0;i<1000;i++){
//      integers.remove();
//      System.out.println(integers.size());
//    }

  }
}
