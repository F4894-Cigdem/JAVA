package J15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> kullanıcdan alınan değerlerle bir int array elemanlarını bukukten kucuge   print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsun?");
        int arrBoyut=scan.nextInt();
        int arr[]=new  int[arrBoyut];

        for (int i = 0; i <arrBoyut ; i++) {
            System.out.println(i+ ". index elemanı giriniz :");
            arr[i]=scan.nextInt();

        }
        System.out.println("istediğin array " +Arrays.toString(arr));
        Arrays.sort(arr);// k->b

        for (int i = arr.length-1; i >=0 ; i--) {// b->k
            System.out.print(arr[i] + " ");


        }


    }
}
