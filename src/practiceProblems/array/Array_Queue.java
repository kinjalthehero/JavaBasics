package practiceProblems.array;


// NOT WORKING
public class Array_Queue {

    int front, rear;
    int[] queue;
    int currentSize;
    int size;

    Array_Queue (int capacity) {

        queue = new int[capacity];
        front = -1;
        rear = -1;
        currentSize = 0;
        size = capacity;

    }

    void enqueue (int num) {

        System.out.println("Adding: " + num + " ");

        if (isFull())
            System.out.println("Full");
        else {
            if (front == -1)
                front++;

            queue[++rear] = num;
            currentSize++;
        }
    }

    void dequeue () {
        if (isEmpty())
            System.out.println("Empty");
        else {
            System.out.println("Removing " + queue[front]);
            front++;
            currentSize--;

            if (front > rear)
                front = rear = -1;
        }
    }

    boolean isFull() {

        if (currentSize == size)
            return true;

        return false;
    }

    boolean isEmpty() {

        if (currentSize == 0)
            return true;

        return false;
    }

    void print() {

        if (isEmpty()) {
            System.out.println("Empty");
            System.out.println();
            System.out.println();
            return;
        }

        System.out.println("F: " + front + " R: " + rear);

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {

        Array_Queue queue = new Array_Queue(5);
        queue.enqueue(6);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.enqueue(3);
        queue.print();
        queue.enqueue(99);
        queue.print();
        queue.enqueue(56);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.enqueue(43);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.enqueue(89);
        queue.print();
        queue.enqueue(77);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.enqueue(32);
        queue.print();
        queue.enqueue(232);
        queue.print();
    }
}
