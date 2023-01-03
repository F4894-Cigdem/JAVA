package J10_StringManipulations;

public class C09_ReplaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
         *

         */

        String str="javaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '@'));//j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer
        System.out.println(str.replace("can", "kan"));//javaCAN'lara selam olsun java ile bolkana offer

        /** ReplaceFirst
 * Replace ile aynı sadece ilk bulunanı değiştirir
 */

        System.out.println(str.replaceFirst("a", "@"));

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        str = "       javaCAN'lara selam olsun :) java ile 12345678765 bolcana offer***    ";
        System.out.println(str.replaceAll("\\s", "+"));//+++++++javaCAN'lara+selam+olsun+:)+java+ile+12345678765+bolcana+offer***++++
        System.out.println(str.replaceAll("\\S", "+"));//++++++++++++ +++++ +++++ ++ ++++ +++ +++++++++++ +++++++ ++++++++
        System.out.println(str.replaceAll("\\w", "+"));// +++++++'++++ +++++ +++++ :) ++++ +++ +++++++++++ +++++++ +++++***
        System.out.println(str.replaceAll("\\W", "+"));//+++++++javaCAN+lara+selam+olsun++++java+ile+12345678765+bolcana+offer+++++++
        System.out.println(str.replaceAll("\\d", "+"));//       javaCAN'lara selam olsun :) java ile +++++++++++ bolcana offer***
        System.out.println(str.replaceAll("\\D", "+"));//++++++++++++++++++++++++++++++++++++++++++++12345678765+++++++++++++++++++++



        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234
//

        String isim= "Çigdem";
        String soyad="Şen";
        String kartNo="1234567890123456";

        String yeniIsim=isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yeniSoyIsim=soyad.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yeniKartNo="**** **** ****"+kartNo.substring(12);
        System.out.println("isim-soyisim : " + yeniIsim +" " +yeniSoyIsim+" kart no : " +yeniKartNo);//isim-soyisim : Ç***** Ş***** kart no : **** **** ****3456

    }
}
