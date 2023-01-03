package day03;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    public static void main(String[] args) {
              /*
    Kullanici dan yas bilgisini alarak

       oy kullanma yasi :
      age >= 18  ==> oy kullanmaya uygun
      age >= 70  ==> uc kez oy kullanabilir
      70 > age >=50 ==> iki kez oy kullanabilir
      50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

    */
        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int age = scan.nextInt();

        if (age>=18) {
            System.out.println("yaşınız oy kullanmaya uygun");
            if (age>=70) {
                System.out.println(" üç kez oy kullanabilirsiniz");
            } else if (age>=50) { //70>age>=50 ..50 51...69
                System.out.println("iki kez oy kullanabilirsiniz");
            } else  {
                System.out.println("bir kez oy kullanabilirsiniz");}}

        else {
            System.out.println("oy kullanamazsınız");}






    }
}
