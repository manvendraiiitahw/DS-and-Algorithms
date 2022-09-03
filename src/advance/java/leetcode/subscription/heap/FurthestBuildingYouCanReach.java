package advance.java.leetcode.subscription.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

//You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.
//        You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
//        While moving from building i to building i+1 (0-indexed),
//        If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
//        If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
//        Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.
public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int[] arr = {4,12,2,7,3,18,20,3,19};
        FurthestBuildingYouCanReach youCanReach = new FurthestBuildingYouCanReach();
        System.out.println(youCanReach.furthestBuilding(arr, 10, 2));
    }

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        int i ;
        for ( i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if(diff<1){
                continue;
            }
            if (ladders > 0) {
                priorityQueue.add(diff);
                ladders--;
            } else {
                if (priorityQueue.size()>0 && priorityQueue.peek() < diff && bricks >= priorityQueue.peek()) {
                    bricks = bricks - priorityQueue.peek();
                    priorityQueue.poll();
                    priorityQueue.add(diff);
                } else if (bricks >= diff) {
                    bricks = bricks - diff;
                } else {
                    break;
                }
            }
        }
        return i;
    }
}
