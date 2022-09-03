package com.learn.booking;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArray {
  public static void main(String[] args){
    int[] num=new int[]{1,2};
    int[] num1=new int[]{3,4};
    System.out.println(findMedianSortedArrays(num,num1));
}
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    ArrayList<Integer> list=new ArrayList<Integer>();
    for(int i: nums1){
      list.add(i);
    }
    for(int i: nums2){
      list.add(i);
    }
    Collections.sort(list);
    int len=list.size();
    if(len%2==0){
      return ((list.get(len/2) + list.get((len/2)-1))/2.0);
    }else {
      return list.get(len/2);
    }
  }
}