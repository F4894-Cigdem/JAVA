package J04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int num1=scanner.nextInt();

        System.out.println("bir sayı giriniz:");
        int num2=scanner.nextInt();

        System.out.println("bir sayı giriniz:");
        int num3=scanner.nextInt();

        System.out.println("çarpım sonuç:"+(num1*num2*num3));




    }
}
