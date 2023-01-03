package J15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //Array eşitlik kontrolü... equals(9 -> methodu index ve value kontrolü yapar ve true/false return eder

        int sayi1[]={39,3,72,63,84};
        int sayi2[]={84,72,63,3,39};

        System.out.println("sayi1 ve sayı2 eşit mi: " +Arrays.equals(sayi1, sayi2));//false

        Arrays.sort(sayi1);
        Arrays.sort(sayi2);

        System.out.println("sayi1 ve sayı2 eşit mi: " +Arrays.equals(sayi1, sayi2));//true

        String str=Arrays.toString(sayi1);
        System.out.println("str = " + str);//str = [3, 39, 63, 72, 84]
        System.out.println(str.substring(6));//, 63, 72, 84]


    }
}
