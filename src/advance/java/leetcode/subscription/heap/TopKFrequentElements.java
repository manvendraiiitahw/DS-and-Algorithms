package advance.java.leetcode.subscription.heap;

import java.util.*;

//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
public class TopKFrequentElements {
    class Frequency {
        int num;
        int count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        TopKFrequentElements topKFrequentElements=new TopKFrequentElements();
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(nums, 2)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        PriorityQueue<Frequency> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.count));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (priorityQueue.size() < k) {
                Frequency frequency = new Frequency();
                frequency.count = entry.getValue();
                frequency.num = entry.getKey();
                priorityQueue.add(frequency);
            } else {
                assert priorityQueue.peek() != null;
                if (priorityQueue.peek().count < entry.getValue()) {
                    priorityQueue.poll();
                    Frequency frequency = new Frequency();
                    frequency.count = entry.getValue();
                    frequency.num = entry.getKey();
                    priorityQueue.add(frequency);
                }
            }
        }
        int[] output = new int[k];
        int i = 0;
        while (!priorityQueue.isEmpty()) {
            output[i] = priorityQueue.poll().num;
            i++;
        }
         Arrays.sort(output);
        return output;
    }
}
