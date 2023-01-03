package J10_StringManipulations.ödev;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Üç kelimelik bir isim giriniz : ");
        String ucIsim=scan.nextLine();

        String isim1 = ucIsim.valueOf(ucIsim.toUpperCase().charAt(0));
        String isim2 = ucIsim.valueOf(ucIsim.toUpperCase().charAt(ucIsim.indexOf(" ")+1));
        String isim3 = ucIsim.valueOf(ucIsim.toUpperCase().charAt(ucIsim.lastIndexOf(" ")+1));
        System.out.println(isim1 + "." + isim2 + "." +isim3+ ".");







    }
}
