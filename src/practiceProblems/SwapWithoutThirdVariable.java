package practiceProblems;


/*
    Inputs:
    str1 = "Hello";
    str2 = "Elk"

    Output:
    str1 = "Elk";
    str2 = "Hello"

    Algorithm
    str1 = str1 + str2;
    str2 = str1.substring(0, str1.length - str2.length)
    str1 = str1.substring(str2.length)

 */


public class SwapWithoutThirdVariable {


    String str1 = "Hello";
    String str2 = "Elk";

    public void swap() {

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
    }

    public static void main(String[] args) {

        SwapWithoutThirdVariable obj = new SwapWithoutThirdVariable();
        obj.swap();
        System.out.println(obj.str1);
        System.out.println(obj.str2);
    }



}
