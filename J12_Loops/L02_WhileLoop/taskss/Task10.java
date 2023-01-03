package J12_Loops.L02_WhileLoop.taskss;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz : ");
        int sayi=sc.nextInt();

        int tek=0;
        while (sayi>0) {
            if (sayi%2==1) {
                System.out.print(sayi);
            }
            sayi--;
        }
        System.out.println(" "+sayi);



    }
}
