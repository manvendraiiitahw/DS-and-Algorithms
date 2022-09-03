package com.learn;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 10/13/19
 */

public class Person {
  int age;
  String firstName;
  String lastName;
  String country;

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", country='" + country + '\'' +
        '}';
  }

  public Person(int age, String firstName, String lastName, String country) {
    super();
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}

