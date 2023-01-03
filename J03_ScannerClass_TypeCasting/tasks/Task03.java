package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Günde kaç saat uyuyorsunuz : " );
        int uyku= scan.nextInt();

        System.out.println("ayda "+uyku*30 +" saat uyuyorsun" );
        System.out.println("yılda "+uyku*uyku*365 +" saat uyuyorsun" );
        System.out.println("40 yılda "+uyku*365*40 +" saat uyuyorsun" );






    }
}
