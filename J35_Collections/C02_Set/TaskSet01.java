package J35_Collections.C02_Set;

import java.util.HashSet;
import java.util.List;

public class TaskSet01 {
    public static void main(String[] args) {
        /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

        HashSet<String> hs=new HashSet<>(List.of("banana" , "strawberry" , "kiwi" , "pineapple"));
        String a="banana";
        String b="peach";
        System.out.println(changeSet(hs, a, b));

    }

    public static HashSet changeSet(HashSet<String> hs, String a, String b) {

        if (hs.contains(a)){
            hs.remove(a);
            hs.add(b);}

        return hs;
    }
}
