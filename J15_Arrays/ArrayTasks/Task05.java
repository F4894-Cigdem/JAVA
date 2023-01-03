package J15_Arrays.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= scan.nextInt();
        String yeniSayi = String.valueOf(sayi);

        String sayı [] = yeniSayi.split("");
        for (int i = sayı.length - 1; i >= 0; i--) {
            System.out.print(sayı[i]);
        }




    }
  
}
