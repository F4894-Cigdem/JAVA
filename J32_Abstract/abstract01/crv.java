package J32_Abstract.abstract01;

public class crv extends Honda{
    @Override
    public void motor() {
        System.out.println("2.4 super turbo motor . arazi seni bekler 4x4");
    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk arazide daha temiz olur");

    }

    @Override
    void kapi() {
        System.out.println("kapılar vakumlu. çarpılmayasın!!!");

    }
}
