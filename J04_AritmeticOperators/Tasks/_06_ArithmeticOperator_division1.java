package J04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*     kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz.   */

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int num1=scanner.nextInt();

        System.out.println("bir sayı giriniz:");
        int num2=scanner.nextInt();

        System.out.println("bölüm sonuç:"+(num1/num2));


    }
}
