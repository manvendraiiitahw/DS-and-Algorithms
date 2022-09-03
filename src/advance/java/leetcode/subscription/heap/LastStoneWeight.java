package advance.java.leetcode.subscription.heap;

//You are given an array of integers stones where stones[i] is the weight of the ith stone.
//
//        We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
//        Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
//
//        If x == y, both stones are destroyed, and
//        If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
//        At the end of the game, there is at most one stone left.
//
//        Return the smallest possible weight of the left stone. If there are no stones left, return 0.

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {1};
        LastStoneWeight lastStoneWeight=new LastStoneWeight();
        System.out.println(lastStoneWeight.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            priorityQueue.add(stone);
        }
        int curStone = priorityQueue.poll();
        while (!priorityQueue.isEmpty()) {
            if (curStone == priorityQueue.peek()) {
                priorityQueue.poll();
                if (priorityQueue.size()>0) {
                    curStone = priorityQueue.poll();
                }else{
                    curStone = 0;
                }
            } else {
                int peekEle = priorityQueue.poll();
                if (peekEle > curStone) {
                    priorityQueue.add(peekEle - curStone);
                } else {
                    priorityQueue.add(curStone - peekEle);
                }
                curStone=priorityQueue.poll();
            }
        }
        return curStone;
    }
}
