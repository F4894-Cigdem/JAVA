package J15_Arrays.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsun?");
        int sayi = scan.nextInt();
        int sayiArr[] = new int[sayi];

        for (int i = 0; i < sayiArr.length; i++) {
            System.out.println(i + ". index elemanı giriniz :");
            sayiArr[i] = scan.nextInt();
        }
        for (int i = 0; i <sayiArr.length ; i++) {
            if (sayiArr[i] % 2 == 1) {
                System.out.print(sayiArr[i]);
            }
        }

            



    }
}