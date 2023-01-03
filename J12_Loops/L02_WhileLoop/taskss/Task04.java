package J12_Loops.L02_WhileLoop.taskss;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		int sayi = 999;
		int bölen = 0;
		while (sayi>=100) {
			if (sayi % 3 == 0 && sayi % 4 == 0) {
				bölen++;
				System.out.print(sayi + " ");
			}
			sayi--;
		}

		System.out.println("\n"+bölen);

	}

}
