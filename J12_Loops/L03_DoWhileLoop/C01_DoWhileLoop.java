package J12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop->önce şart kontrol edilir eğer şart sonucu true alınırsa body action çalışır.
        do-While loop->önce body action çalışır sonra şart kontrol edilir. şart true ise döngü devam eder
        şart false ise döngü kırılır ve döngüden sonraki ilk şart çalışır.
        do-While loop->  game app. de daha çok kullanılır.

        Trick: while loop sart sağlanmazsa hiç çalışmayabilir ama do-while sart sağlasın sağlamasın
        en az bir kez çalışır..

         */
        int yas=33;
        while (yas <33){
            System.out.println("agam yas " +yas +" 33 gayet basarılı");
            System.out.println("while body action.....");
            yas++;

        }

        do {
            System.out.println("agam yas 33 gayet basarılı");
            System.out.println("do while body action ");
            yas++;


        }while (yas <33);




    }
}
