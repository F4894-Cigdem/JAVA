package J26_Inheritance.Task01;

public class Runner {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj);//A class dan hürmetler

        B b=new B();
        System.out.println("b.mesaj = " + b.mesaj);//static variable inheritance'de class name olmadan call edilir

    }
}
