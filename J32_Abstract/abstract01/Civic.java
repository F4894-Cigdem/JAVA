package J32_Abstract.abstract01;

public class Civic extends Lastik {//Honda parent abs Class extend child concrete class
    /*
    extends Honda yazılarak  Honda Class'a concrete bir Civic class tanımlandı
    java CTE verdi
    çözüm:
    a)Unimplemented (uyarlanmıs) method implement edilmeli
    b)parent Honda class'dan abstract keyword kaldırılmalı
    c)concrete olan child civic class abstract tanımlamalı

     */

    // concrete class'da abs method tanımlanır mı?
    // public abstract void absMethod();//ya class abs olmalı ya da method concrete olmalı...
    // TRICK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli


    @Override
    public void motor() {
        System.out.println("1.6 eco motor az yakar çok kaçar ");
    }

    @Override
    void koltuk() {
        System.out.println("ucuz olsun diye koltuk kumaşını temiz kullanın");

    }

    @Override
    void kapi() {
        System.out.println("5 kapı sedan ");
    }
    public int vites() {
        return 5;
    }

    @Override
    public void lastikEbat() {

    }

   // Honda obj=new Civic();
   // Civic obj1=new Civic();
}
