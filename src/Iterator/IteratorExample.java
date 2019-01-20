package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> games = new ArrayList<>(10);

        games.add("abc");
        games.add("pqr");
        games.add("ttt");
        games.add("vvv");

        System.out.println("original Size of ArrayList : " + games.size());

        //Looping over ArrayList in Java using advanced for loop
        System.out.println("Looping over ArrayList in Java using advanced for loop");
        for(String game: games){
            //print each element from ArrayList
            System.out.print(game + " ");
        }

        //You can also Loop over ArrayList using traditional for loop
        System.out.println("Looping ArrayList in Java using simple for loop");
        for(int i =0; i<games.size(); i++){
            System.out.print(games.get(i)+ " ");
        }

        System.out.println("Looping ArrayList in Java using Iterator");
        Iterator<String> itr = games.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
            //System.out.println("Removing " + itr.next() + " element from the array");
            //itr.remove();
        }
    }
}
