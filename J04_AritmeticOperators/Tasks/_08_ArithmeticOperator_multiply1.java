package J04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        double num1=scanner.nextDouble();

        System.out.println("bir sayı giriniz:");
        double num2=scanner.nextDouble();

        System.out.println("bir sayı giriniz:");
        double num3=scanner.nextDouble();

        System.out.println("Çarpım sonuç:"+(num1*num2*num3));



    }
}
