package practiceProblems.array;

import java.util.Arrays;

public class Array_Compress {

    /*public static int compress(char[] chars) {

        int anchor = 0, write = 0;

        for (int i = 0; i < chars.length; i++)
        {
            if (i + 1 == chars.length || chars[i + 1] != chars[i])
            {
                chars[write++] = chars[anchor];

                if (i > anchor)
                    for (char c: ("" + (i - anchor + 1)).toCharArray())
                        chars[write++] = c;

                anchor = i + 1;
            }
        }

        return write;
    }*/

    public static int compress(char[] chars)
    {
        int slow = 0, fast = 0;

        while(fast < chars.length)
        {
            char currentChar = chars[fast];
            int count = 0;

            while (fast < chars.length && chars[fast] == currentChar)
            {
                fast++;
                count++;
            }

            chars[slow++] = currentChar;

            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[slow++] = c;
        }

        return slow;
    }

    public static void main(String[] args) {


        char[] arr = {'a','a','b','b','c','c','c'};
        System.out.println(compress_kinjal(arr));

        char[] arr2 = {'a','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress_kinjal(arr2));
    }

    static int compress_kinjal (char[] arr) {

        int slow = 0, fast = 0, counter = 0;

        while (slow < arr.length && fast < arr.length) {

            while (fast < arr.length && arr[slow] == arr[fast]) {
                counter++;
                fast++;
            }

            if (counter != 1) {
                for (char c : Integer.toString(counter).toCharArray()) {
                    arr[++slow] = c;
                }
            }

            slow++;
            counter=0;
        }

        System.out.println(Arrays.toString(arr));
        return slow;
    }
}

