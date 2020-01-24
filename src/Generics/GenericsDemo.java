package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static <T> void printCollection (List<T> arr) {

        System.out.println(arr);
    }

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            intList.add(i);
        }

        printCollection(intList);

        List<String> stringList = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            stringList.add("a");
        }

        printCollection(stringList);
    }


}
