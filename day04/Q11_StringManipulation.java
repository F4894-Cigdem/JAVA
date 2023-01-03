package day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz ");
        String isim = scan.nextLine();

        System.out.println("soyisminizi giriniz");
        String soyisim = scan.nextLine();

        if (isim.length() > soyisim.length()) {
            System.out.println("isim daha uzun");
        } else {
            System.out.println("soyisim daha uzun");
        }

    }}