package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
         Kullanicidan bir sayi alin

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("bir sayi giriniz : ");
        int sayi= sc.nextInt();

        if (sayi>0) {
            if (sayi>10) {
                System.out.println("BÜYÜKSÜN");
            }else System.out.println("NORMALSİN");

        }else  if (sayi <0) {
            if (sayi>-10) {
                System.out.println("NEGATİFSİN!");
            }else System.out.println("ÇOK POZİTİFSİN!");
        }else System.out.println("yanlış sayı girdiniz");
    }
}
