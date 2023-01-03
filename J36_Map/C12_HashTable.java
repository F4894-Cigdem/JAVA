package J36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
           /*
        HashTable ->
        HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
        1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
        olam bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
        2-HashTable HashMap'e göre daha yavaştır
        3-HashTable key ve value'lerda null değere izin vermez.
        4-HashTable eleman atamsı yapılırken  HashMap randum(rastgele: hurra )  yapar.
         */

        Hashtable<String,String>ht=new Hashtable<>();

        ht.put("kebap","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdağ");
        ht.put("çorba","beyran");
        ht.put("söğüş","");
        System.out.println("ht = " + ht);//ht = {köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, kebap=adana}
        ht.put("döner","dönerse senindir :) ");//döner key update edilir. key'de dublicate değil üzerine value ataması yapar
        System.out.println("ht = " + ht);//ht = {köfte=tekirdağ, söğüş=, çorba=beyran, döner=dönerse senindir :) , kebap=adana}
        //ht.put(null,"trileçe");//RTE
        //ht.put("kahve",null);//RTE
        System.out.println("selametle devam...");

        Hashtable<String,String>ht1=new Hashtable<>();
        ht1.put("salata","patlıcan közleme");
        ht1.put("ara sıcak","içli köfte");
        System.out.println("ht1 = " + ht1);

        ht.putAll(ht1);
        System.out.println("ht = " + ht);
        System.out.println("ht1 = " + ht1);


    }

}
