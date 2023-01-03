package J12_Loops.L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //41 kere maşallah print ediniz
       // System.out.println("maşallah");
       // System.out.println("maşallah");
       // System.out.println("maşallah");
       // System.out.println("maşallah");
       // System.out.println("maşallah");
       // System.out.println("maşallah");
       // Sydstem.out.println("maşallah");

        /*
        loop-> döngü tekrarlama aksiyonlar için kullanılan code bloklardır.
         */

      /*  for (int i = 1; i <= 41 ; i++ ) {
            System.out.println(i+ ".maşallah");}

       */

        //task -> 2 basamaklı tek sayılar

        for (int i=11 ; i <= 99 ; i+=2) {
            System.out.print(i+" ");}

        System.out.println("    *****     ");
        for (int i=10 ; i <100 ; i++) {
            if (i%2==1) {
                System.out.print(i+ " ");
            }
        }
        for (int i = 0 ; i>10 ; i++) { // 0 10 dan büyük değil. şartı sağlamadığı için kırılır. body run olmaz
            System.out.println("selam javacan");
        }

        for (int i = 0; i >=0 ; i++) {
            System.out.println(i);

        }





    }
}
