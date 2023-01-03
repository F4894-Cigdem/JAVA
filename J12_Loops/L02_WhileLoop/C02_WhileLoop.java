package J12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //girilen tamsayının rakamları toplamını print eden method create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz : ");
        int sayi = sc.nextInt();

        System.out.println(rakamTopla(sayi));


    }

    private static int rakamTopla(int sayi) {
        int rakamToplamı=0;
        while (sayi > 0) {
            rakamToplamı += sayi % 10;
            sayi /= 10;
        }
        return  rakamToplamı;

    }
}