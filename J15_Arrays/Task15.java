package J15_Arrays;

public class Task15 {
    public static void main(String[] args) {

        //task->arr tüm elemanlarının çarpımını print eden code create ediniz

        int sayi[][]={{1,2,3},{9,8}};

        int carpim=1;

        for (int kat = 0; kat <sayi.length ; kat++) {
            for (int daire = 0; daire <sayi[kat].length ; daire++) {
                carpim*=sayi[kat][daire];

            }

        }
        System.out.println(carpim);

    }
}
