package J13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden bir code create ediniz.

        Scanner scan = new Scanner(System.in);
        String dgruPin = "javaCAN";
        int girisHakki = 3;

        while (true) {
            System.out.println("pin kodunuzu giriniz : ");
            String agaPin = scan.nextLine();

            if (agaPin.equals(dgruPin)) {
                System.out.println("başarılı:)");
                break;
            } else {
                System.out.println("bi daha deneyiniz");
                girisHakki--;
                System.out.println("kalan canın : " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("canın kalmadı");
                    break;
                }
            }


        }
    }
}
