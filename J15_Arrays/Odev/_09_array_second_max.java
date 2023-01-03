package J15_Arrays.Odev;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */
        int sayilar []={15 , 25, 22, 18, 30};

        Arrays.sort(sayilar);

        for (int i=0; i <sayilar.length; i++) {

        }

        System.out.println(sayilar[sayilar.length-2]);

    }
}
