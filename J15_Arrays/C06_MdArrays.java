package J15_Arrays;

import java.util.Arrays;

public class C06_MdArrays {
    public static void main(String[] args) {
       /*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
       *  icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

        //MdArray tanımlama...
        int arr1[][]=new int[3][5];//3 satır 5 sutun
        //bir sitede her birinde 10 dairelik 8 katlı 6 apt var. Nasıl atty olarak tanımlanır

//Trick -> Arry i uzunluklatı ile tanımlamak için inner (daire) uzunlukları eşit olmalı

        int site[][][]=new int[6][8][10];

        // 24 kişilik 3 sınıf ve 21 kişilik 5 sınıfı olan okul nasıl arr olarak tanımlanır
        int sinif1[][]=new int[3][24];
        int sinif2[][]=new int[5][21];

        //MdArray eleman ekleme...
        arr1[2][4]=35;
        arr1[0][3]=34;
        System.out.println(arr1[0][3]);

        //elemanları girilerek array tanımlama
        int arr [][]={{1,2,3},{10,20},{101}};//  3 katlı apt

        //101 eleman indexi->arr[2][0]

        //MdArray elemanları print etme
        System.out.println(arr[1]);//arr[1] bir array olduğu için sout komutu arr[1] in referansını verir
        System.out.println(Arrays.toString(arr[1]));//[10,20]
        System.out.println(arr[1][0]);//10

        System.out.println(Arrays.deepToString(arr));//[[1, 2, 3], [10, 20], [101]]


    }
}
