package day07;

import java.util.Scanner;

public class Q07DoWhile {
    public static void main(String[] args) {


/*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */

        Scanner scan=new Scanner(System.in);
        char c;

        do {
            System.out.println("bir karakter giriniz : ");
            c = scan.next().toLowerCase().charAt(0);
            System.out.println(" Program çalışıyor");
        }


        while (c!='x');
        System.out.println("Program bitti");

    }

}
