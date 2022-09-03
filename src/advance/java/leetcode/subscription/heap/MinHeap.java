package advance.java.leetcode.subscription.heap;

public class MinHeap {
    int[] minHeap;
    int realSize;
    int heapSize;

    public MinHeap(int heapSize) {
        this.heapSize = heapSize;
        minHeap = new int[heapSize + 1];
        minHeap[0] = 0; //will not use this value
    }

    public void add(int ele) {
        realSize++;
        if (realSize > heapSize) {
            System.out.println("can not add any more elements");
            realSize--;
            return;
        }
        minHeap[realSize] = ele;
        int index = realSize;
        int parent = index / 2;
        while (minHeap[parent] > minHeap[index] && index > 1) {
            int t = minHeap[parent];
            minHeap[parent] = minHeap[index];
            minHeap[index] = t;
            index = parent;
            parent = index / 2;
        }
    }

    public int remove() {
        if (realSize < 1) {
            System.out.println("no element available to delete");
            return Integer.MAX_VALUE;
        } else {
            int removeElement = minHeap[1];
            minHeap[1] = minHeap[realSize];
            realSize--;
            int index = 1;

            while (index <= realSize/2) {
                int left = index * 2;
                int right = index * 2 + 1;
                if (minHeap[index] > minHeap[left] || minHeap[index] > minHeap[right]) {

                    if (minHeap[left] < minHeap[right]) {
                        int t = minHeap[left];
                        minHeap[left] = minHeap[index];
                        minHeap[index] = t;
                        index = left;
                    } else {
                        int t = minHeap[right];
                        minHeap[right] = minHeap[index];
                        minHeap[index] = t;
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
        return minHeap[1];
    }

    public String toString() {
        if (realSize == 0) {
            return "No element!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 1; i <= realSize; i++) {
                sb.append(minHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        // Test case
        MinHeap minHeap = new MinHeap(9);
        minHeap.add(9);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.add(19);
        minHeap.add(81);
        minHeap.add(12);
        minHeap.add(17);
        minHeap.add(2);
        minHeap.add(3);
        // [1,3,2]
        System.out.println(minHeap.toString());
        // 1
        System.out.println(minHeap.peek());
        // 1
        System.out.println(minHeap.remove());
        // [2, 3]
        System.out.println(minHeap.toString());
        minHeap.add(4);
        // Add too many elements
        minHeap.add(5);
        // [2,3,4]
        System.out.println(minHeap.toString());
    }

}
