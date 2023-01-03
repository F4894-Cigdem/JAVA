package J10_StringManipulations.ödev;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("ad ve soyadınızı  giriniz : ");
        String adSoyad= scan.nextLine();

        if (adSoyad.contains(" ")) {
            String ad = adSoyad.substring(0, (adSoyad.indexOf(" ")));
            System.out.println("adınız = " + ad);
            String soyad = adSoyad.substring((adSoyad.indexOf(" ") + 1), (adSoyad.length()-1)) + adSoyad.charAt(adSoyad.length()-1);
            System.out.println("soyadınız = " + soyad);
        }else System.out.println("Ad ve soyadınızın arasına boşluk koyarak yazın yoksa çözemem:)");


    }
}
