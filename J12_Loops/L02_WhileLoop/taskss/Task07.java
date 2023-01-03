package J12_Loops.L02_WhileLoop.taskss;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print eden code create ediniz

        int input=1;
        int maxSayi=0;
        Scanner scanner = new Scanner(System.in);
        while (input<=5){

            System.out.println(input+". sayı giriniz: ");
            int sayi= scanner.nextInt();
            maxSayi=Math.max(maxSayi,sayi);
            input++;

        }
        System.out.println("en büyük sayı= "+maxSayi);





    }
}
