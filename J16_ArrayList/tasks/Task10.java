package J16_ArrayList.tasks;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        List <Integer>list=new ArrayList<>();
        for (int a:arr) {
            list.add(a);
        }
        List <Integer> sonList=new ArrayList<>(new HashSet<>(list));
        System.out.println(sonList);



    }

}
