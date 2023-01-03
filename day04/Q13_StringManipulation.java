package day04;

import java.util.Scanner;

public class Q13_StringManipulation {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz ");
        String kelime = scan.nextLine();

        if (kelime.length()!=4) {
            System.out.println("4 harfli bir kelime giriniz!");
        }else {
            System.out.println(kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1));
        }








    }
}