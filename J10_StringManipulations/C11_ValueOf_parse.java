package J10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        // Task-> string type verilen 2 adet bağış miktarını toplayan code create ediniz.

        String bagis1 = "1500";
        String bagis2 = "2500";

        int bagisDegeri1 = Integer.valueOf(bagis1);
        int bagisDegeri2 = Integer.valueOf(bagis2);
        System.out.println("toplam bagis miktarı : " + (bagisDegeri1+bagisDegeri2));//toplam bagis miktarı : 4000


        int fetih=Integer.valueOf(  "1453");
        System.out.println(fetih);//1453


        System.out.println("toplam bagis : " +(Integer.parseInt(bagis1) + Integer.parseInt(bagis2)));//toplam bagis : 4000

        int tc=1234567;
       String strTc =String.valueOf(tc);
        System.out.println("strTc = "+ strTc);//strTc = 1234567
        System.out.println("strTc + tc  = "+ strTc + tc);//strTc + tc  = 12345671234567


        String fiyat= "$150";
        int yeniFiyat = Integer.valueOf(fiyat);
        System.out.println("yeniFiyat = " + yeniFiyat);





    }
}
