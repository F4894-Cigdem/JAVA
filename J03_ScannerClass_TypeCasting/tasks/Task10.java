package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

    // c = (f-32)*5/9

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("celcius a çevirmek istediğiniz fahrenheit değeri giriniz:");
        double fah=scan.nextDouble();

        System.out.println("sonuç:"+(fah-32)*5/9);




    }
}
