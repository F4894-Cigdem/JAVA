package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsayı giriniz:");
		int sayi1=scan.nextInt();

		System.out.println("bir tamsayı giriniz:");
		int sayi2=scan.nextInt();

		System.out.println("toplama:"+(sayi1+sayi2));
		System.out.println("çıkarma:"+(sayi1-sayi2));
		System.out.println("çarpma:"+(sayi1*sayi2));
		System.out.println("bölme:"+(sayi1/sayi2));



	}

}
