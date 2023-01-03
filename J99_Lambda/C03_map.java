package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        ciftKarePrint(sayi);

        System.out.println("\n  ***    ");

        tekKupPrint(sayi);

        System.out.println("\n  ***    ");

        ciftKarakokPrint(sayi);



    }
    // Task : Functional Programming ile listin cift elemanlarinin  karelerini
    // ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ciftKarePrint(List <Integer>sayi) {
        sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(t->t*t).forEach(C01_LambdaExpression::yazdir);


    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini
    // ayni satirda aralarina bosluk birakarak print edi

    public static void tekKupPrint(List <Integer>sayi) {

        sayi.
                stream().
                filter(t->t%2==1).
                      map(t->(int)Math.pow(t,3)+1).

        forEach(C01_LambdaExpression::yazdir);
    }

    //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek
    // veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini
    // ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void ciftKarakokPrint(List <Integer>sayi) {

        sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(t -> Math.sqrt(t)).
                forEach(t-> System.out.print(t+ " "));
    }



}
