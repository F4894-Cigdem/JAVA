package J15_Arrays;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsun?");
        int arrBoyut=scan.nextInt();
        int arr[]=new int[arrBoyut];

        for (int i = 0; i <arrBoyut ; i++) {
            System.out.println(i + ". index elemanı giriniz :");
            arr[i] = scan.nextInt();
        }

        int toplam=0;
        for (int i = 0; i < arrBoyut; i++) {
            toplam+=arr[i];
        }
        System.out.println("toplam : " + toplam);


    }

}

