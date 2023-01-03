package J15_Arrays.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		int arr[] = {5,6,7,9};
		int yeniArr[] = new int[arr.length];

		for (int i = 0; i <= arr.length-1; i++) {
			if (i == arr.length - 1) {
				yeniArr[i] = arr[0];
			} else
				yeniArr[i] = arr[i + 1];

			System.out.println(Arrays.toString(yeniArr));

		}

	}
}
