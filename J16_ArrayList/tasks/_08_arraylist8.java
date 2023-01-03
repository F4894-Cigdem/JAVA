package J16_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Collections;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        int sayiArr[] = {5,3,4,6,7};

        System.out.println("en buyuk eleman 2.si = " + secondMax(sayiArr).remove(1));
    }//main sonu

    private static ArrayList<Integer> secondMax(int[] sayiArr) {

        ArrayList<Integer> enbüyük = new ArrayList<>();//sayıların atanacagı boş list


        for (int i = 0; i < sayiArr.length; i++) {

            enbüyük.add(sayiArr[i]);
            Collections.sort(enbüyük); //
            Collections.reverse(enbüyük);

        }
        return enbüyük;

    }

    }


