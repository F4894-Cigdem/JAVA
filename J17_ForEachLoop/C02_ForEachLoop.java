package J17_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task array elemanlarının çarpımını print eden code create ediniz

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
        int carpim = 1;
        for (int a[] : arr) {
            for (int b : a) {
                carpim *= b;
            }
        }
        System.out.println("çarpımı : " +carpim);
    }
}
