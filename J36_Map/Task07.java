package J36_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Task07 {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Lion", 1);
        hm.put("Tiger", 2);
        hm.put("Elephant", 3);
        hm.put("Cat", 4);
        hm.put("Dog", 5);

        System.out.println(returnKey(hm));


    }

    public static ArrayList<String> returnKey(HashMap<String, Integer> hm){

        ArrayList<String> list = new ArrayList<>();
        for(String value : hm.keySet()) {
            list.add(value);
        }
        return list;

    }

}



