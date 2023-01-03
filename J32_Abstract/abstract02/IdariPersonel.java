package J32_Abstract.abstract02;

public class IdariPersonel extends Personel {
    @Override
    public void maasHesapla() {
        System.out.println("frapan idarecimize saati $120 verilir:)");

    }

    @Override
    public void maasBilgisi() {
        System.out.println("cıncık kod yazan personele ekstradan 1 ay ikramiye");

    }

    @Override
    public void sigorta() {
        super.sigorta();
    }
}
