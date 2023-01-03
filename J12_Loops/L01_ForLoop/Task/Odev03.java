package J12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int sayi= scan.nextInt();

        int sayac=0;

        for (int i = 2; i < sayi ; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac==0) {
                System.out.println("Asal bir sayıdır");
            }   else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }




    }
}
