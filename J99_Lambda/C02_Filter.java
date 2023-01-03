package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        printCiftElStructured1(sayi);

        System.out.println("\n  ***    ");

        printCiftElFunctional(sayi);

        System.out.println("\n  ***    ");

        printCiftElFunctional1(sayi);

        System.out.println("\n  ***    ");

        printElFunctional(sayi);

        System.out.println("\n  ***    ");

        printElFunctional2(sayi);




    }
    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini
    // aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElStructured1(List<Integer> sayi) {//amele method
        for (Integer w : sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //Task : "Functional Programming":Cincix code kullanarak list elemanlarının çiftlerini
    // aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElFunctional(List<Integer> sayi) {
        sayi.
                stream().//list elemanları akışa alındı
                filter(t->t%2==0).//akıştaki list elemanları çift olma şartına göre filtrelendi. akıştan çıkarıldı
                forEach(C01_LambdaExpression::yazdir);//c01 classdaki yazdır method refere edildi
    }

    public static void printCiftElFunctional1(List<Integer> sayi) {

        sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                forEach(C01_LambdaExpression::yazdir);

    }

    //Task : "Functional Programming":cincix code kullanarak list elemanlarının
    // 35 den küçük  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printElFunctional(List<Integer> sayi) {
        sayi.
                stream().
                filter(t->t <35 && t%2==0).
                forEach(C01_LambdaExpression::yazdir);
    }






//Task : "Functional Programming":cincix code kullanarak list elemanlarının
// 34 den buyuk YADA  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printElFunctional2(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t > 34 || t == 0).
                forEach(C01_LambdaExpression::yazdir);

    }

}
