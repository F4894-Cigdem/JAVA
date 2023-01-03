package J15_Arrays.ArrayTasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsun?");
        int arrBoyut = scan.nextInt();
        int arr[] = new int[arrBoyut];

        for (int i = 0; i < arrBoyut; i++) {
            System.out.println(i + ". index elemanı giriniz :");
            arr[i] = scan.nextInt();

        }
        System.out.println("" +
                "girilen arraylerden 3 e bölünenler : ");
        for (int i = 1; i < arrBoyut; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }


        }

    }
}
