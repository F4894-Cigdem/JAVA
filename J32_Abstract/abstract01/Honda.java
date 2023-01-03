package J32_Abstract.abstract01;

public abstract class Honda {//parent abs class

    public abstract void motor();

    void sunrooff() {
        System.out.println("keyfini biliyorsun:) ekstra ücret :) ");
    }
// abs class'da variable tanımlanabilir mi?
    String name= "Gülsüm team lead";
// variable'ler abs tanımlanır mı? -> kesinlikle hayır
// public abstract int yas=48;

    abstract void koltuk();

    abstract void kapi();

   // final void finalMethod();//concrete method body siz olamaz
   // final abstract void finalMethod();//abs method final olamaz

   // private void privateMethod();//concrete method body siz olamaz
   // private abstract void privateMethod();//abs method private olamaz

   // static void gunesMethod();//concrete method body siz olamaz
   // static abstract void gunesMethod();//abs method static olamaz

    //Honda obj=new Honda();//melekler doğurmaz. abs class obj üretmez

}
