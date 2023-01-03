package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf();-> list içinde istenen elemanın index değerini return eder
        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","losAngeles","Londra","stockholm"));

        System.out.println(listSehir.indexOf("Londra"));//2
        System.out.println(listSehir.indexOf("Londra"));//-1 case sensitive
        System.out.println(listSehir.indexOf("Angara"));//-1//List'te olmayan eleman index i -1 return eder
        System.out.println(listSehir.indexOf("manisa"));//-1
        listUlke.add("Amerigonya");
        System.out.println(listUlke);
        System.out.println(listUlke.indexOf("Amerigonya"));//1-> tekrarlı elemanlarda soldan (baştan) ilk bulunan eleman indexi return eder
        System.out.println(listUlke.lastIndexOf("Amerigonya"));//sağdan(sondan) ilk bulunan elemanın indexi return eder



    }
}
