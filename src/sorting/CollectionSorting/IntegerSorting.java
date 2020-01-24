package sorting.CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSorting {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(6);

        Collections.sort(list);

        System.out.println(list);

        List<String> stringList = new ArrayList();
        stringList.add("abc");
        stringList.add("pqr");
        stringList.add("aabc");
        stringList.add("xyz");
        stringList.add("def");
        stringList.add("ccc");

        Collections.sort(stringList);

        System.out.println(stringList);
    }







}
