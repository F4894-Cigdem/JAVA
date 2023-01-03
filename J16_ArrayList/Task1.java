package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static ArrayList <String>gunler=new ArrayList<>(Arrays.asList("pazartesi","salı","çarşamba","perşembe","cuma","cumartesi","pazar"));
    static ArrayList <Double>gunlukKazanclar =new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static double haftaCirosu=0;

    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */
        int gun=0;
        while (gun <7) {
            System.out.println(gunler.get(gun) +"gunun hasılatını gir : ");
            double gunKazancı= scan.nextDouble();
            gunlukKazanclar.add(scan.nextDouble());
            haftaCirosu +=scan.nextDouble();
            gun++;

        }
        System.out.println(haftaCirosu);
    }
}
