package J35_Collections.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class TaskSet03 {
    public static void main(String[] args) {
        /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı
    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */

        HashSet<Integer> strHset1 = new HashSet<>(Arrays.asList(4,2,3,1,7));
        System.out.println("totalCount : " + totalCount(strHset1));
    }
    private static int totalCount(HashSet<Integer> strHset1) {
        return strHset1.size();
    }
}
