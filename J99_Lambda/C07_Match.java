package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));

        hrfSys7DenAzKontrol(menu);
        System.out.println("\n   ***   ");
        wİleBaslama(menu);
        System.out.println("\n   ***   ");
        xİleBitme(menu);
        System.out.println("\n   ***   ");


    }
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.


    private static void hrfSys7DenAzKontrol(List<String> menu) {

        boolean kontrol = menu.stream().allMatch(t -> t.length() <= 7);
        if (kontrol) {
            System.out.println("menüdekiler 7 ve daha az karakterden oluşuyor :)");
        } else System.out.println("menüdekiler 7 karakterden fazla");

    }

    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.

    private static void wİleBaslama(List<String> menu) {
        boolean kontrol1 = menu.stream().noneMatch(t -> t.toLowerCase().startsWith("w"));
        if (kontrol1) {
            System.out.println("w ile başlamaz");
        } else System.out.println("w ile başlar");
    }
    // Task : List elelmanlarinin "x" ile biten en az bir elemanını
    // kontrol ediniz.

    private static void xİleBitme(List<String> menu) {
        boolean kontrol1 = menu.stream().anyMatch(t -> t.toLowerCase().endsWith("x"));
        if (kontrol1) {
            System.out.println("x ile biten var");
        } else System.out.println("x ile biten yok");
    }
}
