package day04;

import java.util.Scanner;

public class Q09_StringManipulation {
    /*
      Kullanicidan bir kelime girmesini isteyin.
      * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri yazdirin.
      */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz : ");
        String kelime= scan.nextLine();

        char ortancaKarakter =kelime.charAt((kelime.length()-1)/2);

        if (kelime.length()%2==1 && kelime.length()>=3) {
            System.out.println("ortanca karakter :" + ortancaKarakter);
        } else {
            System.out.println("tek sayıda karakter içeren bir kelime giriniz ");
        }






    }
}
