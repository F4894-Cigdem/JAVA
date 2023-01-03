package J12_Loops.L02_WhileLoop.taskss;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("bir metin giriniz: ");
		String str=scanner.nextLine().toLowerCase();
		int harf=0;
		int rakam=0;
		int charr=0;
		int index=0;
		do {
			if (str.charAt(index)>='a'&&str.charAt(index)<='z'){
				harf++;
			} else if (str.charAt(index)>='0'&&str.charAt(index)<='9') {
				rakam++;

			}else charr++;
			index++;

		}while (index<=str.length()-1);

		System.out.println("karakter sayısı: "+charr+"\nrakam sayısı: "+rakam+"\nharf sayısı: "+harf);


	}

}
