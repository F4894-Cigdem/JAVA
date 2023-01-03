package J34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

        List<String>l1=new ArrayList<>(Arrays.asList("Nur","Gamze","Erol","Bekir"));
        System.out.println("l1 List ilk hali: " +l1);

        // l1 elamanları for loop ile print ediniz...

        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i)+" ");

        }
        System.out.println("  ****  ");

        //l1 elemanları for each ile print edelim
        for (String each:l1);{

            System.out.println(l1 + " ");
        }
        System.out.println();
        System.out.println("  ***  ");

        //l1 herbir elemanı :_) for loop ile update edip print ediniz

        for (int i=0; i <l1.size(); i++) {
            l1.set(i,l1.get(i)+" :-) ");
        }
        System.out.println("li :-) update sonrası :"+l1);//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]

        System.out.println();
        System.out.println("  ***  ");

        //l1 herbir elemanı :-) for-each loop ile update edip print ediniz

        for (String w:l1) {
            w+=" :-( ";
        }
        System.out.println("l1 :-) update sonrası :"+l1);//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]

        /*
        index desteklemeyen yapılarda tekrarlayan aksiyon için for-eacch loop update yapamayabilir
        yukarıdaki task'de olduğu gibi. Bu durumda java ıterator interface'den tanımlanacak variable ile tekrarlayan
        aksiyonlar index olmadan yapılır
         */

        System.out.println();
        System.out.println("   *** Iterators ***   ");

        Iterator<String>it1=l1.iterator();//iterator interface'den it1 variable tanımlandı
        //Atama olarak l1 elemanları atandı
        while (it1.hasNext()){
            ////hasNext()->it1 elamanları için pointer old yerde elekman varsa true yoksa false verir ve pointer bir sonrakı elelman önüne koyulur
            //next()-> list'in pointer önündeki elemanını return eder

            System.out.print(it1.next()+" ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-)
        }

        System.out.println();
        System.out.println("   *** Iterators ***   ");


        List<String>l2=new ArrayList<>(Arrays.asList("Baran","Gülsüm","Akif","Nazım"));
        //l2 elemanlarını iterator ile silip print ediniz
        System.out.println("iterator öncesi l2: " +l2);//[Baran, Gülsüm, Akif, Nazım]
        Iterator<String>it2=l2.iterator();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();

        }
        System.out.println("iterator remove sonrası l2: " +l2);//[]

        List<String>l3=new ArrayList<>(Arrays.asList("Baran","Gülsüm","Akif","Nazım"));
        //l3 elemanlarını iterator ile :-) set edip print ediniz->

        System.out.println("iterator öncesi l3 : " +l3);
        ListIterator <String> it3=l3.listIterator();

        while (it3.hasNext()){

                    it3.set(it3.next()+" :-) ");
        }

        System.out.println("iterator set sonrası l3: " +l3);


        System.out.println("   ***ListIterator***   ");
        List <String>l4=new ArrayList<>(Arrays.asList("Serhat","Yakup","Mustafa","Nazlı"));
        System.out.println("List iterator öncesi l3 : "+l3);
        //l3 elamanlarının ilk harfi büyük kalan 3 harfi *** karakteri ve l4 listi ekleyip print ediniz
        ListIterator <String>it4=l3.listIterator();

        while (it4.hasNext()) {
            it4.set(it4.next().toUpperCase().charAt(0)+"***");
        it4.add(l4.toString());

        }

        System.out.println("List iterator set ve add sonrası l3 : " +l3);
        //[B***, [Serhat, Yakup, Mustafa, Nazlı], G***, [Serhat, Yakup, Mustafa, Nazlı], A***, [Serhat, Yakup, Mustafa, Nazlı], N***, [Serhat, Yakup, Mustafa, Nazlı]]


    }
}
