package J12_Loops.L01_ForLoop.Task;

public class Odev08 {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

        for (int i =99; i >0 ; i--) {

            if (i%2==1) {
                System.out.print(i +" ");
            }

        }



    }
}
