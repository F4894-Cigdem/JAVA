package J16_ArrayList.tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

        ArrayList<String> strlist = new ArrayList<>(List.of("New jersey","New york" , "Ohio" , "Florida" , "Boston"));

        System.out.println(" array in ilk hali: "+strlist);
        getLength(strlist);


    }

    private static void getLength(ArrayList<String> strlist) {
        for (String w: strlist) {
            System.out.print(w.length()+" ");

        }


    }



}