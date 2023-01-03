package J10_StringManipulations;

import java.util.Scanner;

public class C07_IndexOf_LastIndexOf {
    public static void main(String[] args) {


        String str = "Good";
        System.out.println("ilk görülen o nun yeri index nosu : " + str.indexOf('o'));//1
        System.out.println("d nin yeri index no su : " + str.indexOf('d'));//3
        System.out.println("d nin yeri index no su : " + str.indexOf('D'));//-1

        // TRICK= olamayan karakter indexi sorgulanırsa -1 return eder.

        System.out.println("od un yeri index no su : " + str.indexOf("od"));// 2
        System.out.println("od un yeri index no su : " + str.indexOf("Od"));// -1

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim = "mustafa nizamoğlu";
        System.out.println(isim.indexOf('a'));//4
        System.out.println(isim.lastIndexOf('a'));//11
        System.out.println(isim.lastIndexOf("fa"));//5
        System.out.println(isim.lastIndexOf("fa"));//5

        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("kafi miktar bir cümle giriniz");
        String cumle = scan.nextLine().toLowerCase();

        if (cumle.indexOf("java") == -1) {
            System.out.println("Girilen cumle java içermiyor.");
        } else if (cumle.indexOf("java") == cumle.lastIndexOf("cumle")) {
            System.out.println("girilen cumle 1 tane java içeriyor");
        }else System.out.println("girilen cümlede birden fazla java var");






        }
    }
