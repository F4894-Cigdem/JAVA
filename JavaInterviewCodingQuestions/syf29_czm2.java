package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class syf29_czm2 {
    public static void main(String[] args) {

        // Sayfa 31 Sımple Calculator
        
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        double ilkSayi = scan.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double ikinciSayi = scan.nextDouble();
        System.out.print("işleminizi giriniz : ");
        char islem = scan.next().charAt(0);
        islemMenu(islem, (int) ilkSayi, (int) ikinciSayi);
    }
    public static void islemMenu(char islem, int x, int y) {
        switch (islem) {
            case '+':
                topla(x, y);
                break;
            case '-':
                cikar(x, y);
                break;

            case '*':
                carp(x, y);
                break;
            case '/':
                bol(x, y);
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
        }

    }

    public static void topla(int a, int b) {

        System.out.println("a+b = " + (a + b));
    }

    public static void carp(int a, int b) {

        System.out.println("a*b = " + (a * b));
    }

    public static void cikar(int a, int b) {

        System.out.println("a-b = " + (a - b));
    }

    public static void bol(int a, int b) {

        System.out.println("a/b = " + (a / b));
    }

}

