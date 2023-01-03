package J12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda for loop
        ama adım sayısı belli olmayıp bir şarta bağlı olan tekrarlarda while loop kullanılmalı
        */
        //task01-> 11 den 20 ye kadar sayıları print eden code create ediniz

        int i=11;
        while (i <21) {
            System.out.print(i+" ");i++;

        }

        // 7 kere javaCAN print eden code create ediniz

        int j=1;
        while (j < 8) {
            System.out.println("javaCAN ");
            j++;

        }

        //task03-> 2 basamaklı tek sayıları print eden code create ediniz

        int a=11;
        while (a <100) {
            System.out.print(a +" "); a+=2;
        }

        //task04-> girilen metni tersten print eden code pr ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String metin=scan.next();

        int metinUzunluk=metin.length()-1;
        while (metinUzunluk>=0) {
            System.out.print(metin.charAt(metinUzunluk));
            metinUzunluk--;


        }

        //task05-> girilen tamsayıya kadar olan tamsayıların toplamını print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz : ");
        int sayi=sc.nextInt();

        int toplam=0;
        while (sayi>0) {
            toplam+=sayi;
            sayi--;
        }
        System.out.println("sayı toplamı : "+toplam);

        //task06 faktöriyel

        Scanner scn=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz : ");
        int sayii=scn.nextInt();

        int faktoriyel=1;

        while (sayii>0) {
            faktoriyel*=sayii;
            sayii--;

        }

        System.out.println("faktoriyel = " + faktoriyel);
    }
}
