package J16_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */



    public static void main(String[] args) {
        ArrayList<String> coloursList = new ArrayList<>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
        System.out.println("Array orjinal hali = " + coloursList);

        String s1= "blue";
        String s2= "yellow";

        System.out.println("Array sonuç : "+ changeInArraylist(coloursList,s1, s2));

    }
    private static ArrayList<String> changeInArraylist( ArrayList<String> coloursList, String s1, String s2) {

        Collections.replaceAll(coloursList,s1,s2);
        return  coloursList;
    }
}
