package J35_Collections.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class TaskSet02 {
    public static void main(String[] args) {
  /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
        LinkedHashSet<String> strhs = new LinkedHashSet<>(Arrays.asList("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));

        String str1= "Germany";
        String str2 = "USA";
        System.out.println("ilk hali : " + strhs);

        System.out.println("son hali . " + removing(strhs, str1, str2));
    }

    private static LinkedHashSet<String> removing(LinkedHashSet<String>strhs,String str1,String str2) {
        if (strhs.contains(str1)&& strhs.contains(str2))
            strhs.remove(str1);
        strhs.remove(str2);

        return strhs;
    }
}
