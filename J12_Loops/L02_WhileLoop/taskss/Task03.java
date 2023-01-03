package J12_Loops.L02_WhileLoop.taskss;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("bir tamsayı giriniz : ");
		int sayi=sc.nextInt();

		int carpim=1;

			while (carpim<=10) {
				System.out.print(sayi +"x" +carpim +"=" +(sayi*carpim) +" ");
				carpim++;


		}

	}

}
