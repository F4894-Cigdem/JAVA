package J35_Collections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_Linked_List {
    public static void main(String[] args) {
        /*
        LinkedList...
        1- LinkedList'de elemanlar "data " ve "adress" olmak üzere 2 kısımdan oluşur ve eleman yerine "node" olarak tanımlanır
        2- LinkedList'de ilk node data barındırmayan sadce adres bulunduran head node tanımlanmıştır
        3- LinkedList'de son node adress kısmı null eden sadce data bulunduran tail node tanımlanmıştır
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantajlıdır. LinkedList eleman bulmada index yapısı olamdığı için başarısızdır
        5-LinkedList -> tren vagon ilişkisi bağlantısı gibi düşünülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List,Queue....) olmamasına dikkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir
        7- LinkedList class 2 tane parent interface'den (List,Queue) implement etmiştir.

         */

        LinkedList <String>ll1 =new LinkedList<>(Arrays.asList("Ebubekir","Gülsüm","Gülsüm","Adem","İlker","Merve"));
        System.out.println("ll1 = " + ll1);

        ll1.add("Uğur");
        System.out.println("ll1 = " + ll1);

        ll1.add(2,"Abdülaziz");
        System.out.println("ll1 = " + ll1);

        ll1.addFirst("Javacan");
        System.out.println("ll1 = " + ll1);

        ll1.addLast("Javatar");
        System.out.println("ll1 = " + ll1);

        List<String> ll2 = new LinkedList<>(Arrays.asList("Fatih", "Erol", "Nur"));//DataType interface List olan LinkedList
        ll1.addAll(ll2);
        //ll1.addAll("Agam");//CTE-> paramete Col olmazsa

        System.out.println("ll1 = " + ll1);//[JavaCAN, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, ugur, JavaTAR, Fatih, Erol, Nur]
        ll1.addAll(3, ll2);
        System.out.println("ll1 = " + ll1);//[JavaCAN, Ebubekir, Gülsüm, Fatih, Erol, Nur, Abdulaziz, Adem, İlker, Merve, ugur, JavaTAR, Fatih, Erol, Nur]
    }





    }
