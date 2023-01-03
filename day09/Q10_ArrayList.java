package day09;

import kotlin.collections.ArrayDeque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10_ArrayList {
     /*
		A list has elements “H”, “G” and “E”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		Example : [H, G, E]
                  Enter a letter :  h
                  [Got It, G, E]
                  Enter a letter :  a
                  [H, G, E, A]
        */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("bir harf giriniz : ");
         String harf=scan.nextLine().toUpperCase();

         List <String> str=new ArrayList<>(List.of("H","G","E"));

         if (!str.contains(harf)) {
             str.add(harf);
             System.out.println(str);
         }
         else {
             Collections.replaceAll(str,harf,"Got it");
             System.out.println(str);
         }


     }









}
