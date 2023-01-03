package J19_StaticVariable;

public class C02_StaticBlock {

     /*
        1.static block yapıları static variable'rı değer ataması update için kullanılır
        2.static block Class oluşturulduğunda bütün methodlardan (main method dahil) önce çalışır
        3.birden fazla static block varsa yukarıdan aşağıya sıralama ile çalışır.
        */


    static  String isim="Haluk";//güneş->static var
    static  {
        System.out.println("agam 1. static block çalıştı :) ");
        isim="Dilek Hanım";
        System.out.println("isim : "+isim);
    }
    public static void main(String[] args) {
        System.out.println("main method başladı :)");
        isim="Kerim Bey";
        System.out.println("isim : " +isim);
    }//main sonu
    static {
        System.out.println("agam 2. static block çalıştı :)");
        isim="UGUR JavaCAN";
        System.out.println("isim : "+isim);


    }
}
