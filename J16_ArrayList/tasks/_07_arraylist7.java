package J16_ArrayList.tasks;

import java.util.ArrayList;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {

        Integer ArrayList1[] = {3,2,5,6};
        Integer ArrayList2[] = {5,8,9};

        System.out.println("eşit olanlar" + common_values(ArrayList1, ArrayList2));


    }

    private static ArrayList<Integer> common_values(Integer[] ArrayList1, Integer[] ArrayList2) {
        ArrayList<Integer> eşit = new ArrayList<>();//tek sayıları atanacagı boş list


        for (int i = 0; i < ArrayList1.length; i++) {
            for (int j = 0; j < ArrayList2.length; j++) {
                if (ArrayList1[i] == ArrayList2[j]) {
                    eşit.add(ArrayList1[i]);
                }

            }


        }
        return eşit;

    }

    /*public static void main(String[] args) {

        ArrayList <Integer> list1= new ArrayList<>(List.of(1,2,3,5,6,8,9,4,7,3,6));
        ArrayList <Integer> list2= new ArrayList<>(List.of(12,4,7,85,25,1,6,9,44));
        Set<Integer> listYeni = new HashSet<>();

        System.out.println(common_values(list1, list2, listYeni));

    }

    private static  Set<Integer> common_values(ArrayList <Integer> list1,ArrayList <Integer> list2,Set <Integer> listYeni) {

        for (int a:list1){

            if (list2.contains(a)){
                listYeni.add(a);
            }
        }
        return listYeni;

     */



    }
