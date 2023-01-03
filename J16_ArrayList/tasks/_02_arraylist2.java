package J16_ArrayList.tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class _02_arraylist2 {
    public static void main(String[] args) {
         /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */
        ArrayList <Integer> arr=new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(getSum(arr));
    }

    private static int getSum(ArrayList <Integer>arr) {
        int toplam = 0;
        for (int i = 0; i < arr.size(); i++) {
            toplam += arr.get(i); ;
        }
        return toplam;
    }



}

