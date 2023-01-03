package J22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //period->iki tarih arasında geçen tekrarlanabilen zamanı tutar
        LocalDate bugun=LocalDate.now();

        LocalDate fathBirthDay=LocalDate.of(1993,5,19);
        Period fark=Period.between(fathBirthDay,bugun);
        System.out.println("fark = " + fark);//fark = P-29Y-5M-7D

        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());//fark.toTotalMonths() = 353
        System.out.println("fark.getDays() = " + fark.getDays());//fark.getDays() = 7

        System.out.println("   ***    ");
        System.out.println("bugun = " + bugun);
        Period period5Gun=Period.ofDays(5);// 5 günde bir tekrarlanan period
        Period period7Ay=Period.ofMonths(7);//7 ayda bir tekrarlanan period
        Period periodX=Period.ofMonths(7).ofDays(21);//7 ayda bir tekrarlanan period

        bugun=bugun.plus(period5Gun);//bugüne 5 gunlşuk period eklendi
        System.out.println("bugun = " + bugun);
        bugun=bugun.minus(period7Ay);//bugune 7 aylık period geri gidildi
        System.out.println("bugun = " + bugun);
        bugun=bugun.plus(periodX);
        System.out.println("bugun = " + bugun);
        //task-> 5.9.2022 de başlayan kurs 9 ay olduğuna göre bitiş tarihini print eden code create ediniz

        LocalDate baslangic=LocalDate.of(2022,9,5);
        System.out.println("baslangic = " + baslangic);

        Period kursSure=Period.ofMonths(9);
        System.out.println("baslangic.plus(kursSure) = " + baslangic.plus(kursSure));

        System.out.println("baslangic.plus(kursSure).format(DateTimeFormatter.ISO_DATE) = " + baslangic.plus(kursSure).format(DateTimeFormatter.ISO_DATE));

        //ISO-> International Organization for Standardization


    }
}
