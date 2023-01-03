package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class C08_limit {
    public static void main(String[] args) {
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));

        KrktrSysEnByk(menu);
        System.out.println("\n   ***   ");

    }
// Task : Karakter sayisi en buyuk elemani yazdiriniz.
    private static void KrktrSysEnByk(List<String> menu) {
      Stream<String> enBykKrktr=menu.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1);//akışdaki il 1 eleman alındı
       // System.out.println(enBykKrktr);//java.util.stream.SliceOps$1@1a407d53->
        System.out.println(Arrays.toString(enBykKrktr.toArray()));//[bicibici]

    }


}
