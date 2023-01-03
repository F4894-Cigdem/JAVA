package J16_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List <Integer> list=new ArrayList<>(List.of(1,2,3,4,5));
        int toplam=0;
        for (int a:list) {
            double kare=Math.pow(a,2);
            toplam+=kare;

        }
        System.out.println("sayıların kareleri toplamı = " +toplam);
    }
}

