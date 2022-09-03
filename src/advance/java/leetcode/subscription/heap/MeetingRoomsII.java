package advance.java.leetcode.subscription.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
public class MeetingRoomsII {


    public static void main(String[] args) {
        MeetingRoomsII meetingRoomsII=new MeetingRoomsII();
        int[][] arr={{9,16},{6,16},{1,9},{3,15}};
        System.out.println(meetingRoomsII.minMeetingRooms(arr));
    }

    public int minMeetingRooms(int[][] intervals) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        priorityQueue.add(intervals[0][1]);

        for(int i=1;i< intervals.length;i++){

            if(priorityQueue.peek() <= intervals[i][0]){
                priorityQueue.poll();
            }
            priorityQueue.add(intervals[i][1]);

        }

        return priorityQueue.size();

    }
}
