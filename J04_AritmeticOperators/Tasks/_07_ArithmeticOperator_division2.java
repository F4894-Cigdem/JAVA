package J04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int num1=scanner.nextInt();

        System.out.println("bir sayı giriniz:");
        int num2=scanner.nextInt();

        System.out.println("bölüm sonuç:"+(num1/num2));




    }
}
