package J32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="Ebubekir Bey";
        System.out.println("mrb1.name = " + mrb1.name);
        mrb1.sigorta();

        IdariPersonel cncCdr=new IdariPersonel();

        cncCdr.name="Dilek hanım";
        System.out.println("cncCdr.name = " + cncCdr.name);
        cncCdr.sigorta();
        cncCdr.maasHesapla();
        cncCdr.maasBilgisi();


    }
}
