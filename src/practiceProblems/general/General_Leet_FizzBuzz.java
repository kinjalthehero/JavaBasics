package practiceProblems.general;

import java.util.*;

class General_Leet_FizzBuzz {

    public static List<String> fizzBuzz(int n) {

        ArrayList<String> stringList = new ArrayList<String>();
        int i=1;

        while(i <= n)
        {
            if(i%3==0&&i%5==0)
            {
                stringList.add("FizzBuzz");
                i++;
                continue;
            }
            else if(i%3==0)
            {
                stringList.add("Fizz");
                i++;
                continue;
            }
            else if(i%5==0)
            {
                stringList.add("Buzz");
                i++;
                continue;
            }
            else {
                String s=""+i;
                stringList.add(s);
            }

            i++;
        }

        return stringList ;
    }

    public static void main(String[] args) {
        List<String> answer = fizzBuzzkinjal(15);
        System.out.println(Arrays.toString(answer.toArray()));
    }

    static public List<String> fizzBuzzkinjal(int n) {

        List<String> output = new ArrayList<>();
        for (int i=1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                output.add("FizzBuzz");
            else if (i % 3 == 0)
                output.add("Fizz");
            else if (i % 5 == 0)
                output.add("Buzz");
            else
                output.add("" + i);
        }

        return output;
    }
}
