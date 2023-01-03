package J12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //task-> girilen tamsayının pozitif tam bölen sayısını print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz : ");
        int sayi = sc.nextInt();

        int bolenSayi=1;
        int tamBolenAdedi=0;
        while (bolenSayi <= sayi) {
            if (sayi%bolenSayi==0) {
                tamBolenAdedi++;
            }
            bolenSayi++;

        }

        System.out.println(tamBolenAdedi);







    }
}
