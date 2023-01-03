package J16_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

        System.out.println(getCount());
    }

    private static Integer getCount() {

        int say=0;
        String Meyve = "Orange";
        ArrayList<String> listmeyve=new ArrayList<>(List.of("Orange","Kiwi","peach","Banana","Orange","Orange"));
        for (String meyve : listmeyve){
            if(meyve.equals(Meyve)){
                say++;
            }
        }
        return say;
    }
}
/* for (int i = 0; i < listmeyve.size(); i++) {
        if (listmeyve.get(i)==Meyve) {
        say++;
        }
        }
        return say;*/
