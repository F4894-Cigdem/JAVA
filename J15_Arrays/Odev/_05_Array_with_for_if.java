package J15_Arrays.Odev;

import java.util.Arrays;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        int sayi[] = {5, 6, 8, 12, 14, 19};
        System.out.println(Arrays.toString(sayi));
        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] % 2 ==0) {
                toplam+=sayi[i];
            } else {
                toplam-=sayi[i];
            }
            System.out.print(toplam +" ");
        }


    }
}