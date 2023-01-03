package J12_Loops.L02_WhileLoop.taskss;

import java.util.Locale;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print eden code create ediniz

		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi giriniz : ");
		String isim=scan.nextLine().toUpperCase();

		System.out.println("soyisminizi giriniz : ");
		String soyisim=scan.nextLine().toUpperCase();

		String isimSoyisim=isim.concat(soyisim);

		int count=0;

		while (count < isimSoyisim.length()) {
			System.out.print(isimSoyisim.charAt(count)+" ");
			count++;}
			

	}

}
