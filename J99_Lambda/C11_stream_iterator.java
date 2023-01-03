package J99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {
    public static void main(String[] args) {
        System.out.println("TASK01-->amele topla :" + toplaAmele(10));
        System.out.println("TASK01-->cincix topla :" + toplaCincix(10));
        System.out.println("TASK02-->çift topla :" + toplaCift(24));
        System.out.println("TASK03-->ilk x  çift sayı topla :" +toplaIlkXSayi(10));
        System.out.println("TASK04-->ilk x tek sayı topla :" +toplaIlkXTekSayi(10));
        System.out.println("TASK05-->2 nin ilk x kuvveti :");
    ilkXkuvvet(7);



    }  //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

    //Structured Programming
    public static int toplaAmele(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;

        }
        return toplam;
    }

    //Functional Programming
    public static int toplaCincix(int x) {
      return IntStream.
                range(1, x + 1).
                sum();

        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive)
        // kadar sıralı bir IntStream return eder.
    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplaCift (int x) {
        return IntStream.range(1,x+1).filter(C01_LambdaExpression::ciftMi).sum();

    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaIlkXSayi (int x) {
        return IntStream.iterate(2,t->t+2).limit(x).sum();

    }
    //TASK 04 --> Ilk x pozitif tek sayiyi toplayan program  create ediniz.
    public static int toplaIlkXTekSayi (int x) {
        return IntStream.iterate(1, t -> t + 2).limit(x).sum();

    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    public static void ilkXkuvvet (int x) {
       IntStream.iterate(2,t->t*2).limit(x).forEach(C01_LambdaExpression::yazdir);
    }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.

        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.

    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.
    public static OptionalInt istenenSayiXKuvvet(int istenenSayi, int x){
        return  IntStream.
                iterate(istenenSayi,t->t*istenenSayi).//istenenSayi'den başlayıp istenenSayi ile çarpılarak tekrar işlemi tanımlandı
                        limit(x).//akısdaki ilk x eleman akısa alındı.
                        skip(x-1).//akısdaki x den önceki elelmanlar atlandı klanlar akısa alındı
                        findFirst();//akısdaki ilk eleman :x. elelman alındı

    }

}