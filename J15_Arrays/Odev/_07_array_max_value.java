package J15_Arrays.Odev;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        int arr[]={12,2,5,15,8};

        Arrays.sort(arr);

        for (int i=0; i <arr.length; i++) {

        }
        System.out.println(arr[arr.length-1]);

    }
}

