package day05;

import java.util.Scanner;

public class Q02_MethodCreation {
    /* Write a method named isEven that accepts an integer argument.
 The method should return true if the argument is even, or false otherwise.*/
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        System.out.println(isEven(num));
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else return false;
    }

}



