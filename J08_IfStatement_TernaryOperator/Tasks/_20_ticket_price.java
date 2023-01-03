package J08_IfStatement_TernaryOperator.Tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.
 Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.
 Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.
Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.
Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır. ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("hızınız:");
        int currentSpeed = scan.nextInt();
        System.out.println("ehliyetiniz var mı? Varsa true yoksa false yazınız");
        boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (isDriverLicenceAvailable==true) {
            if (currentSpeed>=55 && currentSpeed <=74) {
                System.out.println("cezanız: 100 tl");
            } else if (currentSpeed>=75 && currentSpeed <=84) {
                System.out.println("cezanız: 150 tl");
            } else if (currentSpeed>=85 && currentSpeed <=94) {
                System.out.println("cezanız: 320 tl");
            } else if (currentSpeed>94) {
                System.out.println("cezanız: 500 tl");
            } else System.out.println("gayet iyi gidiyorsunuz");
        }else {
            if (currentSpeed>=55 && currentSpeed <=74) {
                System.out.println("cezanız: 300 tl");
            } else if (currentSpeed>=75 && currentSpeed <=84) {
                System.out.println("cezanız: 350 tl");
            } else if (currentSpeed>=85 && currentSpeed <=94) {
                System.out.println("cezanız: 520 tl");
            } else if (currentSpeed>94) {
                System.out.println("cezanız: 700 tl");
            } else System.out.println("cezanız: 200 tl");

        }


    }
}


