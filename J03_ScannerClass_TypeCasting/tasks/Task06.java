package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kenar giriniz");
        int a= scan.nextInt();

        System.out.println("bir kenar giriniz");
        int b= scan.nextInt();

        System.out.println("üçgenin hipotenüsü = " +Math.sqrt((a*a)+(b*b)));







    }
}
