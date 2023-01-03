package J12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {

/*
girilen bir ifadenin istenen harf sayısını print eden code create ediniz

input : selam javaCAN'lar
output : a sayısı :3
 */
        Scanner scan = new Scanner(System.in);
        System.out.print(" bir cumle girin : ");
        String cumle = scan.nextLine();
        System.out.print(" sayılacak harfi girin : ");
        char harf  = scan.next().charAt(0);

        int harfSayisi=0; // ilk değer sıfır atandı ki saymada etki etmesin

        for (int i = 0; i <cumle.length()-1; i++) {
            if (cumle.charAt(i)==harf) {
                harfSayisi++;
            }

        }
        System.out.println("girdiginizCümle :" +cumle+"'da istediğiniz harf :"  +harfSayisi +" tane var");







    }
}
