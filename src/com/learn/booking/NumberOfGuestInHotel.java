package com.learn.booking;

import java.util.Arrays;

public class NumberOfGuestInHotel {
  public static void main(String[] args) {
    int[] entryTime = new int[]{1, 2, 10, 5, 5};
    int[] exitTime = new int[]{4, 5, 12, 9, 12};

    Arrays.sort(entryTime);
    Arrays.sort(exitTime);
    int i = 1, j = 0;
    int maxGuest = 1, currentGuest = 1;
    int day=0;

    while (i < entryTime.length && j < exitTime.length) {
      if (entryTime[i] <= exitTime[j]) {
        currentGuest++;
        if (currentGuest > maxGuest) {
          maxGuest = currentGuest;
          day=i;
        }
        i++;
      } else {
        currentGuest--;
        j++;
      }
    }
    System.out.println(maxGuest+" present in hotel in day:"+day);


  }
}
