package J34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        /*
         task -> Verilen bir integer listin tek  elemanrının karesini
         tersten iterator  print eden code create ediniz
         */

        List<Integer> l= new ArrayList<>(Arrays.asList(13,45,6,89,90,67,34,12,11));
        System.out.println("l list ilk hali : "+l);
        ListIterator<Integer> it=l.listIterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 1) {
                it.set(num * num);
            } else {
                it.remove();
            }
        }

        System.out.println("list'in tek elemanlarının karesi : "+l);

            while (it.hasPrevious()) {
                System.out.print(it.previous() + " ");
            }

        System.out.println("list'in tek elemanlarının karesinin tersten yazılmış hali : "+l);


        }
}
