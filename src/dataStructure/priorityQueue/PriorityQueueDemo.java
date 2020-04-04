package dataStructure.priorityQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static int findKthLargest(List<Integer> nums, int k) {

        final PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int val : nums) {
            pq.offer(val);
        }

        int index = 4;

        while(index > 0) {
            pq.poll();
            index--;
        }

        return pq.poll();
    }

    public static void priorityQueueInDescOrder (List<Integer> list, int size) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(size, Comparator.reverseOrder());

        for (int val: list)
            queue.offer(val);

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {

        //List<Integer> list = Arrays.asList(3,2,3,1,2,4,5,5,6);
        List<Integer> list = Arrays.asList(9,5,7,6,8,3,1,2,4);
        System.out.println(findKthLargest(list, 5));

        List<Integer> list2 = Arrays.asList(1,2,3,9,5,7,6,8,3,1,2,4);
        priorityQueueInDescOrder(list2, list2.size());
    }
}
