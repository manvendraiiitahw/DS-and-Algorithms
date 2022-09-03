package com.learn.interfac;


public class Country {
  int population;
  String name;
  String continent;

  public Country(int population, String name, String continent) {
    this.population = population;
    this.name = name;
    this.continent = continent;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }
}
