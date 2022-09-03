package com.learn;

import java.util.Stack;

public class RemoveAdjacentDeplucates {

  public static void main(String[] args) {

    String inp = "quhxgrhqqaccxeprunllfieilbothbbmpsg";
    char[] arr = inp.toCharArray();
    Stack<Character> characterStack = new Stack<Character>();
//    characterStack.push(arr[0]);
    int i = 0;
    char top = arr[0];
    boolean flg=false;
    while (i < arr.length) {
      if (characterStack.isEmpty()) {
        characterStack.push(arr[i]);
      } else {
        while (i< arr.length && top == arr[i]) {
          i++;
          flg=true;
        }
        if(flg && !characterStack.isEmpty()){
          characterStack.pop();
          flg=false;
        }
        if (i< arr.length && !characterStack.peek().equals(arr[i])) {
          characterStack.push(arr[i]);
          top = arr[i];
        }
      }
      i++;
    }

    System.out.println(characterStack.toString());


  }
}
