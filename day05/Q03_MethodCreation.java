package day05;

import java.util.Scanner;

public class Q03_MethodCreation {
    public static void main(String[] args) {
        /*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */
        Scanner scan = new Scanner(System.in);
        System.out.println("cm cinsinden bir sayi  giriniz : ");
        double sayi1 = scan.nextDouble();


        System.out.println("Girilen sayinin metre karsiligi: "+metre(sayi1));
        System.out.println("Girilen sayinin metre karsiligi: "+kilometre(sayi1));

    }

    public static double metre (double sayi1){
        double x=sayi1/100;
        return x;
    }
    public static double kilometre (double sayi1){
        double y=sayi1/100000;
        return y;
    }
}
