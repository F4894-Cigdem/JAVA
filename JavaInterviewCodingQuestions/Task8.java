package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Check number even or odd

        //Question even or odd number

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num=scan.nextInt();

        if (num%2==0) {
            System.out.println(num+" is even ");
        } else {
            System.out.println(num+" is odd");
        }

    }
}
