package J15_Arrays.Odev;

import java.util.Arrays;

public class odev {
    public static void main(String[] args) {
        /*
        Task ->
        elemanları : Apple, Orange , Banana, Kiwi
        olan String Array (Dizi) create edip print eden code create ediniz.

         */

        String meyve[]={"Apple,Orange,Banana,Kiwi"};
        System.out.println(Arrays.toString(meyve));

         /*          int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
     */
        int sayilar[]={13,15,14,16,16};
        System.out.println(Arrays.toString(sayilar));

        /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int sayılar[]={25,30,30,35,100};

        int toplam=0;
        for (int i = 0; i <sayılar.length ; i++) {
            toplam+=sayılar[i];
            System.out.println("toplam =" +toplam);}

        /*
        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

        String arr[]={"new jersey" , "new york", "boston","California"};
        System.out.println(arr.length);

         /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        int sayi[] = {5, 6, 8, 12, 14, 19};
        System.out.println(Arrays.toString(sayi));
        int toplm = 0;
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] % 2 ==0) {
                toplm+=sayi[i];
            } else {
                toplm-=sayi[i];
            }
            System.out.print(toplm +" ");
        }







    }
}
