package J15_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
        //task -> arr elemanlarını toplayan code create ediniz

        int apt[][]={{1,2,3},{10,20},{101}};

        int toplam=0;

        for (int kat = 0; kat <apt.length ; kat++) {
            for (int daire = 0; daire <apt[kat].length ; daire++) {
                toplam+=apt[kat][daire];

            }

        }
        System.out.println(toplam);//137
    }
}
