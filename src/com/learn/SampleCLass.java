package com.learn;

import java.util.ArrayList;
import java.util.List;

public class SampleCLass {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();

    }
}
//import java.io.*;
//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.function.*;
//        import java.util.regex.*;
//        import java.util.stream.*;
//        import static java.util.stream.Collectors.joining;
//        import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
//
//    /*
//     * Complete the 'interpolate' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER n
//     *  2. INTEGER_ARRAY instances
//     *  3. FLOAT_ARRAY price
//     */
//
//    public static String interpolate(int n, List<Integer> instances, List<Float> price) {
//        // Write your code here
//        if(instances.size()==1){
//            return String.valueOf(price.get(0));
//        }
//
//
//        if(n>instances.get(instances.size()-1)){
//            return calcVal(n, instances.get(instances.size()-2), instances.get(instances.size()-1), price.get(price.size()-2), price.get(price.size()-2));
//        }
//        if(n<instances.get(0)){
//            return calcVal1(n, instances.get(0), instances.get(1), price.get(0), price.get(1));
//        }
//        Map<Integer, Integer> map=new HashMap<>();
//        int j=0;
//        int prevVal=instances.get(0);
//        map.put(0, prevVal);
//        for(int i=1;i<instances.size();i++){
//            map.put(i, instances.get(j));
//            j++;
//            if(n> prevVal && n < instances.get(j)){
//                return String.valueOf((price.get(i)+price.get(i-1))/2);
//            }
//            prevVal=instances.get(i);
//        }
//        if(instances.contains(n)){
//            return String.valueOf(map.get(map.get(n)));
//        }
//        return "";
//
//
//
//    }
//    static String calcVal(int n, int a1, int a2, float b1, float b2){
//        float diff=b2-b1;
//        int instanceDiff=a2-a1;
//        float q=n/instanceDiff;
//        return String.valueOf(b2-(diff*q));
//    }
//    static String calcVal1(int n, int a1, int a2, float b1, float b2){
//        float diff=b2-b1;
//        if(diff< 0){
//            return "0";
//        }
//        int instanceDiff=a2-a1;
//        float q=n/instanceDiff;
//        return String.valueOf(b1-(diff*q));
//    }
//
//}
//
//public class Solution {