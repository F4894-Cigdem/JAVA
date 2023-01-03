package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("vize1 =?");
        double vize1=scan.nextDouble();

        System.out.println("vize2 =?");
        double vize2=scan.nextDouble();

        System.out.println("Geçme notunuz="+(vize1*0.3+vize2*0.7));


    }
}
