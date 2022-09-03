package com.learn;

public class SolutionTest {
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
  public static void main(String[] args){
    int[] arr={2,1,3,5,4};
    System.out.println(solution(arr));
  }

  public static int solution(int[] A) {
    // write your code in Java SE 8

    int count=0;
    boolean[] turnedOnFlag=new boolean[A.length];
    for(int i=0;i<A.length;i++){
      if(A[i]-1==0){
        turnedOnFlag[A[i]-1]=true;
        count++;
      }else{
        turnedOnFlag[A[i]-1]=true;
        if(isAllTurnedOn(turnedOnFlag, A[i]-1)){
          count++;
        }
      }
    }
    return count;
  }

  private static boolean isAllTurnedOn(boolean[] arr, int curIndex){
    for(int i=0;i<curIndex;i++){
      if(!arr[i]){
        return false;
      }
    }
    return true;
  }

}
