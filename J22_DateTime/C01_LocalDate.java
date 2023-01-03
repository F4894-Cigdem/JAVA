package J22_DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        System.out.println("bugun : " +bugun);//bugun : 2022-10-25

        System.out.println(bugun.getYear());//2022
        System.out.println(bugun.getMonthValue());//10
        System.out.println(bugun.getMonth());//OCTOBER
        System.out.println(bugun.getDayOfYear());//298
        System.out.println(bugun.getDayOfMonth());//25
        System.out.println(bugun.getDayOfWeek());//TUESDAY

        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1923, Month.OCTOBER,29);
        //verilen bir tarihin öncesi ve sonrası gitme..
        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));
        System.out.println("bugun.plusWeeks(6) = " + bugun.plusWeeks(6));
        System.out.println("bugun.minusMonths(5) = " + bugun.minusMonths(5));
        System.out.println("bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));


    }
}
