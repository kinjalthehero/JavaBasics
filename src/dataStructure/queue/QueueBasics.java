package dataStructure.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics
{
    public static void main(String[] args)
    {
        Queue<String> waitingQueue = new LinkedList<>();

        // add
        waitingQueue.add("Rajeev");
        waitingQueue.add("Chris");
        waitingQueue.add("John");
        waitingQueue.add("Mark");
        waitingQueue.add("Steven");
        System.out.println("WaitingQueue : " + waitingQueue);

        // remove()
        // The remove() method throws NoSuchElementException if the Queue is empty
        String name = waitingQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

        // poll()
        // Similar to remove() except that it returns null if the Queue is empty
        name = waitingQueue.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

        // isEmpty
        System.out.println("is waitingQueue empty? : " + waitingQueue.isEmpty());

        // size
        System.out.println("Size of waitingQueue : " + waitingQueue.size());

        // contains("item")
        name = "Johnny";
        if(waitingQueue.contains(name)) {
            System.out.println("WaitingQueue contains " + name);
        } else {
            System.out.println("Waiting Queue doesn't contain " + name);
        }

        /**********************************************
         ITERATIONS
         **********************************************/

        // simple for-each loop
        for(String item: waitingQueue) {
            System.out.println(item);
        }

        // forEach() and lambda
        waitingQueue.forEach(item -> {
            System.out.println(item);
        });

        // iterator()
        Iterator<String> waitingQueueIterator = waitingQueue.iterator();
        while (waitingQueueIterator.hasNext()) {
            System.out.println(waitingQueueIterator.next());;
        }

        // iterator() and forEachRemaining()
        waitingQueueIterator = waitingQueue.iterator();
        waitingQueueIterator.forEachRemaining(item -> {
            System.out.println(item);
        });
    }
}
