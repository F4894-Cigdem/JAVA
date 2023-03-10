package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_listConvertArray {
    public static void main(String[] args) {
        //list i array' a çevirme->toArray()
        //1. yöntem->toArray();parametre olarak String[0] olarak aypılır

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        String arrUlke []=listUlke.toArray(new String[0]);//ulkeList'i elemanları arrUlke olarak atandı

        System.out.println("listUlke = " + listUlke);//[Alamanya, Amerigonya, ingiltere, isvec]
        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke));//[Alamanya, Amerigonya, ingiltere, isvec]
        // 2. Yontem -> oluşturulan Array'in data type  Object olarak atanır.
        // Trıck-> Object class java'da tüm class'ların parent(atası:HZ ADEM)
        //Object->javada parent i olmayan tek  Class dır. (tüm vagonları çeken ama çekilemez bir lokomotif)
        //String Integer Class lar Object Class child i olduğu için istenilen durumlarda data type olarak object Class kullanılabilir
        Object arrUlkeler []=listUlke.toArray();//Object-> Hz.Adem Class'ına atandı
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));//[Alamanya, Amerigonya, ingiltere, isvec]
    }
}
