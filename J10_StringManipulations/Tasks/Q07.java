package J10_StringManipulations.Tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Sadece 3 harfli bir isim giriniz");
        String isim=scan.nextLine();

        String sonuc= (isim.charAt(0)==isim.charAt(1) ||  isim.charAt(1)==isim.charAt(2) || isim.charAt(0)==isim.charAt(2) ? "harfler birbirinden farklı değil" : "harfler birbirinden farklı");
        System.out.println(sonuc);









    }
}