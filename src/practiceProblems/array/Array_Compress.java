package practiceProblems.array;

import java.util.Arrays;

public class Array_Compress {

    public static int compress(char[] chars) {

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
    }

    public static void main(String[] args) {


        char[] arr = {'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));
    }
}

