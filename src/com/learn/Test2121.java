package com.learn;
/*
 * @author Manvendra Kumar(m0k00hw)
 * @since 10/13/19
 */

public class Test2121 {

  public static void main(String[] args) {
//    int[] arr = {9, -1, -3, 4, 5};
    int[] arr = {-1, -2, -3, -4, -5};
    System.out.println(maximizeRatings(arr));
  }

  static int maximizeRatings(int[] ratings) {
    int maxSum = 0;
    int maxSofar = 0;

    int[] out = new int[ratings.length];
    int sum = 0;
    for (int i = 0; i < ratings.length; i++) {
      sum = sum + ratings[i];
    }
    int ex = 0, curSum = sum;
    for (int i = 0; i < ratings.length - 1; ) {
      if ((sum + (ratings[i])) > sum) {
        i++;
        continue;
      } else if (i< ratings.length-1 && (sum + (ratings[i])) > (sum + ratings[i + 1])) {
        out[i] = 1;
        out[i + 1] = 0;
        i = i + 2;
      } else {
        out[i] = 0;
        out[i + 1] = 1;
        i = i + 2;
      }
    }
    int res = 0;
    for (int i = 0; i < ratings.length; i++) {
      if (ratings[i] > -1) {
        res = res + ratings[i];
      } else if (out[i] == 1) {
        res = res + ratings[i];
      }
    }
    return res;
  }


//  public static void main(String []args){
//    List<Person> str=new ArrayList<>();
//    Person p=new Person(29,"Marlon","abc","USA");
//    Person p1=new Person(21,"Bruce","abc","China");
//    Person p2=new Person(25,"Brandom","abc","China");
//    Person p3=new Person(25,"Amjad","abc","India");
//    Person p4=new Person(25,"Amrish","abc","India");
//    Person p5=new Person(25,"Sanjeev","abc","India");
//
//    str.add(p);
//    str.add(p1);
//    str.add(p2);
//    str.add(p3);
//    str.add(p4);
//    str.add(p5);
//
////    str.sort(Comparator.comparing(p3 -> p3.firstName));
//
//    String[] sortBy=new String[2];
//    sortBy[0]="firstName";
//    sortBy[1]="country";
//
//    for(String str1: sortBy){
//      if(str1.equals("firstName")){
//        str.sort(Comparator.comparing(person -> person.getFirstName()));
//      }
//      else if(str1.equals("lastName")){
//        str.sort(Comparator.comparing(person -> person.getLastName()));
//      }
//      else if(str1.equals("age")){
//        str.sort(Comparator.comparing(person -> person.getAge()));
//      }
//      else{
//        str.sort(Comparator.comparing(person -> person.getCountry()));
//      }
//    }
//    for (Person person: str){
//      System.out.println("firstName:"+person.firstName+" and lastname::"+person.country);
//    }
//  }
}
