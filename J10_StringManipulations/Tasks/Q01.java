package J10_StringManipulations.Tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=scan.nextLine();

        if (cumle.contains(" ")) {
            System.out.println("cümle boşluk karakteri içerir");}
        else {
            System.out.println("cümle boşluk karakteri içermez");}
    }
}

