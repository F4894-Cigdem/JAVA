package day06;

import java.util.Scanner;

public class Q05_ForLoop {
    public static void main(String[] args) {
        /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("satır sayısını giriniz ");
        int satir = sc.nextInt();
        System.out.print("sutun sayısını giriniz ");
        int sutun = sc.nextInt();
        for (int i = 1; i <= satir; i++) {
            System.out.println();
            for (int j = 1; j <= sutun; j++) {
                System.out.print("* ");
            }
        }
    }
}
