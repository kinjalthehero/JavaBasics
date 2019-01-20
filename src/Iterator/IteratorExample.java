package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(10);

        for (int i=1; i<=10; i++)
            numbers.add(i);

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
            //System.out.println("Removing " + itr.next() + " element from the array");
            //itr.remove();
        }
    }
}
