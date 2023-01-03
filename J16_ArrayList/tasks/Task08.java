package J16_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        System.out.println("girmek istediğiniz sayının boyutu nedir?");

        int arr[]=new int[sc.nextInt()];
        ortalama(arr);



    }

    private static void ortalama(int arr[]) {

        List<Integer> list = new ArrayList<>();
        System.out.println("hangi sayıları girmek istersiniz : ");
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            toplam += arr[i];
        }
        System.out.println("toplam " + toplam);
        double ortalama = toplam / arr.length;
        System.out.println("ortalama" + ortalama);

        if (sc.nextInt() > ortalama) {
            System.out.println("ortalamadan büyük olan sayılar: " + list);
        }
    }

    }




