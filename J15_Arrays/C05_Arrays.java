package J15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy... copyOf(arr,newLenght);->girilen arrayin newLenght kadar ilk elemanını kopyalar.

        int sayi[]={63,21,47,27,35,12,36,31,46,24};

        int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println(Arrays.toString(yeniArr));//[63, 21, 47, 27, 35]

        int baskaArr[]=Arrays.copyOfRange(sayi,3,8);
        System.out.println(Arrays.toString(baskaArr));//[27, 35, 12, 36, 31]

        // Array i belirli bir eleman ile update(set) etme... fill(arr,value);

        Arrays.fill(sayi,99);
        System.out.println(Arrays.toString(sayi));//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3,7,33);
        System.out.println(Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]
    }
}
