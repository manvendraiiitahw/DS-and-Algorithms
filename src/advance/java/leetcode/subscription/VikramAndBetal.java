package advance.java.leetcode.subscription;

import java.util.*;

public class VikramAndBetal {
    public static void main(String[] args) {
        VikramAndBetal vikramAndBetal=new VikramAndBetal();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            List<Integer> integers=new ArrayList<>();
            for(int i=0;i< n;i++){
                integers.add(sc.nextInt());
            }
            System.out.println(vikramAndBetal.getPair(integers));
            System.out.println(vikramAndBetal.getNoOfPairs(integers));
            t--;
        }
    }

    public static long getNoOfPairs(List<Integer> arr)
    {
        HashMap<Integer,Integer> MAP = new HashMap<>();
        for (Integer integer : arr) {
            if (MAP.containsKey(integer))
                MAP.put(integer, MAP.get(integer) + 1);
            else
                MAP.put(integer, 1);
        }
        int output=0;
        for(Map.Entry<Integer,Integer> entry : MAP.entrySet())
        {
            int VAL = entry.getValue();
            output += (VAL * (VAL - 1)) / 2;
        }
        return output* 2L;
    }

    int getPair(List<Integer> arr) {
        Collections.sort(arr);
        int count = 0;
        boolean status = false;
        int i=0;
        while (i < arr.size()-1){
            if (arr.get(i).equals( arr.get(i + 1))) {
                count++;
                status = true;
            } else {
                if (status) {
                    count++;
                    status = false;
                }
            }
            i++;
        }
        if(status){
            count++;
        }
        return count;
    }
}
