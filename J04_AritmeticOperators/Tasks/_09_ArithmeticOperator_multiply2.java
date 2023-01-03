package J04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        double num1=scanner.nextDouble();

        System.out.println("bir sayı giriniz:");
        double num2=scanner.nextDouble();

        System.out.println("bir sayı giriniz:");
        double num3=scanner.nextDouble();

        System.out.println("bir sayı giriniz:");
        double num4=scanner.nextDouble();

        System.out.println("çarpım değer:"+(num1*num2*num3*num4));





    }
}
