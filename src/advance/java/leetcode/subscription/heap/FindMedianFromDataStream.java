package advance.java.leetcode.subscription.heap;

//The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value and the median is the mean of the two middle values.
//        For example, for arr = [2,3,4], the median is 3.
//        For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
//        Implement the MedianFinder class:
//        MedianFinder() initializes the MedianFinder object.
//        void addNum(int num) adds the integer num from the data stream to the data structure.
//        double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.


import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o));
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

    public void addNum(int num) {
        maxHeap.add(num);
        if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() >= 1) {
            minHeap.add(maxHeap.poll());
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {

        if (minHeap.size() >= 1 && maxHeap.size() >= 1 && minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        } else if(maxHeap.size()>0) {
            return maxHeap.peek();
        }
        return 0;
    }

    public static void main(String[] args) {
        FindMedianFromDataStream median=new FindMedianFromDataStream();
        System.out.println(median.findMedian());
        median.addNum(-1);    // arr = [1]
        System.out.println(median.findMedian());
        median.addNum(-2);    // arr = [1, 2]
        System.out.println(median.findMedian());
        median.addNum(-3);
        System.out.println(median.findMedian());
        median.addNum(-4);
        System.out.println(median.findMedian()); // return 1.5 (i.e., (1 + 2) / 2)
        median.addNum(-5);    // arr[1, 2, 3]
        System.out.println(median.findMedian()); // return 2.0
    }
}
