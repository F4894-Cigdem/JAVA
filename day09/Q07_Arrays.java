package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */



    }//main sonu

    private static ArrayList<Integer> sayilar(int[] sayiArr) {


        ArrayList<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < sayiArr.length; i++) {
            sayilar.add(sayiArr[i]);
            }

        return sayilar;
            }
}
