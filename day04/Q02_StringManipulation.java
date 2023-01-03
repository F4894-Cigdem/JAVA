package day04;

import java.util.Scanner;

public class Q02_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.


    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz : ");
        String ilkKelime= scan.nextLine();

        System.out.println("bir kelime daha giriniz : ");
        String ikinciKelime= scan.nextLine();

        System.out.println(ilkKelime.concat(" " +ikinciKelime));



        // yukardaki örnekte verilen ilk ve ikinci değişkenlerinin ilk harflerini atıp birleştiriniz.

        String str1 = ilkKelime.substring(1);
        String str2 = ikinciKelime.substring(1);

        System.out.println("ilk harfler olmadan birleşimi : " + str1 + " " + str2);






    }
}
