package day11;

import java.util.Scanner;

public class C04_CountOfEnterCode {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin = "sumeyra12345";
        int girisHakki = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Hosgeldiniz****");
        while (true) {
            System.out.println("pin kodu giriniz :");
            String girilenPin = scanner.nextLine();
            if (pin.equals(girilenPin)) {
                System.out.println("basarili giris yaptiniz..");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi...sim kartiniz bloke oldu..");
                break;


            }


        }
    }
}
