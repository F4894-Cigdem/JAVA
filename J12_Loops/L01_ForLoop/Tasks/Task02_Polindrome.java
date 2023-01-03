package J12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
        /* Girilen ifadenin polindrome olmasını kontrol eden method create ediniz:
        polindrome=her iki yönden eşit olan ifadeler. ey edip adanada pide ye

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz ");
        String str = scan.nextLine();

        polindrome(str);


    }

    private static void polindrome(String str) {
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr+= str.charAt(i);//str nin i.ci karakterini ters str ye ekler(concat)
        }
        System.out.println("girilen ifadenin tersi = " + tersStr);
        if (str.equalsIgnoreCase(tersStr)) {
            System.out.println("girilen ifade POLİNDROME");
        } else {
            System.out.println("girilen ifade POLİNDROME değil");

        }
    }
}
