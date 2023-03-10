package J20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By Value bir programlama dilidir.
        Bir primitive variable argument olarak bir methoda call edildiğinde variable değil bir
        copy clone (vesikalık)(pointer) değeri gönderilir.
         */
        //Task -> verilen fiyat için %24 artırılmış fiyatı print eden method create ediniz.

        double fiyat=100;
        System.out.println("method call öncesi fiyat değeri : " + fiyat);//100

        fiyatArttır(fiyat);//fiyat variable method'a parametre call edildi

        System.out.println("method call sonrası fiyat değeri : " +fiyat);//100
    }//main sonu

    public static void fiyatArttır(double bisey) {
        bisey*=1.24;
        System.out.println("arttırılmıs fiyat : " +bisey);

    }
}
