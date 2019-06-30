package practiceProblems.general;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scn.nextLine();


        System.out.println("Enter your age: ");
        int age = scn.nextInt();
        System.out.println("Your name is : " + name);
        System.out.println("Your age is: " + age);



    }
}
