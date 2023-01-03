package J04_AritmeticOperators.Tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("3 basamaklı bir sayı giriniz: ");
		int sayi=scan.nextInt();

		int birler=sayi%10;
		int yuzler=sayi/100;

		System.out.println(birler+yuzler);

		
	}

}
