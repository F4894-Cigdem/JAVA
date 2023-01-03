package JavaInterviewCodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class Syf26_2 {
    public static void main(String[] args) {

       //Convert ArrayList to Array

        //creating Arraylist
        List<String> fruitList =new ArrayList<>();
        //adding String Objects to fruitList ArrayList
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");

        System.out.println("Converting ArrayList to Array");
        String [] str=fruitList.toArray(new String[fruitList.size()]);


        for(String s : str) {
            System.out.println(s);
        }




      /*  List<String> fruitList = new ArrayList<String>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");

        Object [] objects = fruitList.toArray();

        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");

     */
    }
}
