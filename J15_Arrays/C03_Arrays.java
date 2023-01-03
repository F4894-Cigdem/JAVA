package J15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //String i array e çavirme... split()
        String str="javaCAN'lara selam olsun ";
        String strArr[]=str.split(" ");
        System.out.println(Arrays.toString(strArr));// kelime yazdırdık
        System.out.println(strArr.length);

        String harfArr[]=str.split("");
        System.out.println(Arrays.toString(harfArr));// harf yazdırdık
        System.out.println(harfArr.length);//25


    }
}
