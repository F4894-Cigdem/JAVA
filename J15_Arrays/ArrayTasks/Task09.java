package J15_Arrays.ArrayTasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner scn = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsun?");
        int say = scn.nextInt();
        int sayArr[] = new int[say];

        for (int i = 0; i < sayArr.length; i++) {
            System.out.println(i + ". index elemanı giriniz :");
            sayArr[i] = scn.nextInt();
        }
        for (int i = sayArr.length-1; i >=0 ; i--) {
            System.out.print(sayArr[i]);

        }



    }
}
