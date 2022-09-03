package advance.java.leetcode.subscription.heap;

public class MaxHeap {
    int[] maxHeap;
    int realSize;
    int heapSize;

    public MaxHeap(int heapSize) {
        this.heapSize = heapSize;
        maxHeap = new int[heapSize + 1];
        maxHeap[0] = 0; //will not use this value
    }

    public void add(int ele) {
        realSize++;
        if (realSize > heapSize) {
            System.out.println("can not add any more elements");
            realSize--;
            return;
        }
        maxHeap[realSize] = ele;
        int index = realSize;
        int parent = index / 2;
        while (maxHeap[parent] < maxHeap[index] && index > 1) {
            int t = maxHeap[parent];
            maxHeap[parent] = maxHeap[index];
            maxHeap[index] = t;
            index = parent;
            parent = index / 2;
        }
    }

    public int remove() {
        if (realSize < 1) {
            System.out.println("no element available to delete");
            return Integer.MAX_VALUE;
        } else {
            int removeElement = maxHeap[1];
            maxHeap[1] = maxHeap[realSize]; //replace last element with top element
            realSize--;
            int index = 1;

            while (index <= realSize/2) {
                int left = index * 2;
                int right = index * 2 + 1;
                if (maxHeap[index] < maxHeap[left] || maxHeap[index] < maxHeap[right]) {

                    if (maxHeap[left] > maxHeap[right]) {
                        int t = maxHeap[left];
                        maxHeap[left] = maxHeap[index];
                        maxHeap[index] = t;
                        index = left;
                    } else {
                        int t = maxHeap[right];
                        maxHeap[right] = maxHeap[index];
                        maxHeap[index] = t;
                        index = right;
                    }

                } else {
                    break;
                }
            }
            return removeElement;
        }
    }
    public int size(){
        return realSize;
    }

    public int peek(){
        return maxHeap[1];
    }

    public String toString() {
        if (realSize == 0) {
            return "No element!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 1; i <= realSize; i++) {
                sb.append(maxHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        // Test case
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.add(9);
        maxHeap.add(8);
        maxHeap.add(1);
        maxHeap.add(19);
        maxHeap.add(81);
        maxHeap.add(12);
        maxHeap.add(17);
        maxHeap.add(2);
        maxHeap.add(3);
        // [1,3,2]
        System.out.println(maxHeap.toString());
        // 1
        System.out.println(maxHeap.peek());
        // 1
        System.out.println(maxHeap.remove());
        // [2, 3]
        System.out.println(maxHeap.toString());
        maxHeap.add(4);
        // Add too many elements
        maxHeap.add(5);
        // [2,3,4]
        System.out.println(maxHeap.toString());
    }

}
