package advance.java.gudiya;

import java.util.*;

public class Solution4 {
//    static long highestProfit(int numSuppliers, List<Long> inventory, long order) {
//        Collections.sort(inventory);
//        long output = 0l;
//        for (int i = 1; i <= order; i++) {
//            long curItem = inventory.remove(inventory.size() - 1);
//            output += curItem;
//            curItem--;
//            inventory.add(curItem);
//            Collections.sort(inventory);
//        }
//        return output;
//    }

     static long highestProfit(int numSuppliers, List<Long>inventory, long order) {
        PriorityQueue<Long> max_heap
                = new PriorityQueue<Long>((a, b) -> (int) (b - a));
        long maxProfit = 0;

        for (int i = 0; i < numSuppliers; i++)
            max_heap.add(inventory.get(i));
        while (order > 0) {
            order--;
            long X = max_heap.poll();
            maxProfit += X;
            max_heap.add(X - 1);
        }
        return maxProfit;
    }

//    long getMaxUnit(int num, ArrayList<Integer> boxes, int unitSize, ArrayList<Integer> unitsPerBox, long truckSize) {
//
//        List<Integer> packedList = new ArrayList<>()
//        long maxUnits = 0
//
//        for(int i=0;i<num;i++){
//        for (int j=0;j<boxes.get(i);j++){
//        packedList.insert(len(packedList), unitsPerBox[i])
//
//        packedList.sort(reverse = True)
//
//            #Edge
//        case -
//        if truckSize is bigger, then
//    #we can use every box in packedList
//        if truckSize > len(packedList):
//        for i in range(len(packedList)):
//        maxUnits += packedList[i]
//            else:
//            #Since list is sorted, get the max number of units
//        #from packedList
//        for i in range(truckSize):
//        maxUnits += packedList[i]
//
//        return (maxUnits)
//    }


    public static void main(String[] args) {
        List<Long> input = new ArrayList<>();
        input.add(3L);
        input.add(5L);
        System.out.println(highestProfit(2, input, 6));
        List<Long> input1 = new ArrayList<>();
        input1.add(3L);
        input1.add(5L);
        System.out.println(highestProfit(2, input1,6));


//        while(i<len){
//            if(arr[i]==value) {
//                count = count + 1;
//            }
//        i++;
//        }

//        for( int i=0;i<num;i++){
//            char ch='a';
//            for (int j=0;j<=i;j++){
//                System.out.print(ch++);
//            }
//            System.out.println("");
//        }
////        if (message == null) {
//            return null;
//        }
//        if (message.length() < k) {
//            return message.trim();
//        }
//        String[] str = message.split(" ");
//        StringBuilder stringBuilder = new StringBuilder("");
//        int count = 0;
//        for (String s : str) {
//            if (count + s.length() <= k) {
//                stringBuilder.append(s);
//                stringBuilder.append(" ");
//                count = count + s.length() + 1;
//            }
//        }
//        message = stringBuilder.toString();
//        message = message.trim();
//        return message;
    }

}
//
//    public static void main(String[] args) {
//        Solution s=new Solution();
//        System.out.println(s.solution("Codility We test coders", 14));
//        System.out.println(s.solution("Why Not", 100));
//        System.out.println(s.solution("The quick brown fox jumps over the lazy dog", 39));
//        System.out.println(s.solution("to crop or not to crop", 21));
//    }
//}
