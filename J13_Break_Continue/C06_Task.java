package J13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        //task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println(" birşeyler çızıkdırın ");
        String biseyler=scan.nextLine();
        int aSayisi=0;
        for (int i = 0; i <biseyler.length(); i++) {
            if (biseyler.charAt(i)=='a') {
                aSayisi++;
            } else if (biseyler.charAt(i)=='c') {
                break;
            }
            System.out.println("döngüde işleme giren karakterler :" +biseyler.charAt(i));

        }
        System.out.println("çızıkdırdığın bişeylerde a sayısı : " + aSayisi +" tane");


    }
}
