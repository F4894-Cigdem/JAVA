package J15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // task-> sayı arrayindeki iç arraylerin toplamını yeni bir arraya atayıp print eden code create ediniz
       //input: int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        //output: int yeniArr[]={6,11,-7}

        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        int yeniArr[]=new  int[sayi.length];
        int yeniSayi[]=new int[3];

        int toplam=0;
        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
                toplam+=sayi[i][j];}
            yeniSayi[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(yeniSayi));


    }
}
