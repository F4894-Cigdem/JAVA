package J32_Abstract.abstract01;

public class Accord extends Honda {
    @Override
    public void motor() {//implement edilen abs method
        System.out.println("2.0 turbo ateşle");
    }

    @Override
    void koltuk() {//implement edilen abs method
        System.out.println("deri koltuk ter yapar");
    }

    @Override
    void sunrooff() {//override edilen method
        System.out.println("sigara yakınca sunrooffu açmayı unutma");
    }

    @Override
    void kapi() {//implement edilen abs method
        System.out.println("vakumlu kapı ! çarpılma !!! ");
    }
}
