package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class syf29 {
    public static void main(String[] args) {
        // Sımple Calculator

        Scanner scan=new Scanner(System.in);
        System.out.println(" İşlem yapmak istediğiniz 2 sayı giriniz :");
        double ilkSayi=scan.nextDouble();
        double ikinciSayi=scan.nextDouble();

        System.out.println("Bir işlem seçiniz ( +,-,*,/ )");

        char islem=scan.next().charAt(0);

        double sonuc=0;

        switch (islem) {
            case '+':
                sonuc=ilkSayi+ikinciSayi;
                break;
            case '-':
                sonuc=ilkSayi-ikinciSayi;
                break;
            case '*':
                sonuc=ilkSayi*ilkSayi;
                break;
            case '/':
                sonuc=ilkSayi/ikinciSayi;
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem giriniz");
                break;

        }

        System.out.println(sonuc);
    }

}
