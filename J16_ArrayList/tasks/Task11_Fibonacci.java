package J16_ArrayList.tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz :");
        int sayi = scan.nextInt();

        List<Integer> fibosayi = new ArrayList<>();
        int x = 0, y = 1, toplam = 1;

        if (sayi > 0) {
            while (toplam < sayi) {
                fibosayi.add(toplam);
                toplam = x + y;
                x = y;
                y = toplam;

            }
            System.out.println("girilen sayıya kadar olan fibonacci sayıları: " + fibosayi);

        } else System.out.println("girilen sayı sıfırdan büyük olmalı");

    }






}
