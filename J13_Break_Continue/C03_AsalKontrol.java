package J13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        //task->girilen tamsayının asal olamsını kontrol eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tane tam sayı giriniz : ");
        int sayi= scan.nextInt();

        boolean asalMi=true;
        for (int i =2; i <sayi; i++) {
            if(sayi%i==0) {
                asalMi=false;
            break;}
            else {
                System.out.println(sayi +"false");
                break;
            }

        }
        if (asalMi) {
            System.out.println("girilen sayı asal");
        }else System.out.println("girilen sayı asal değil");

        //EKSİK!TEKRAR BAK
    }
}