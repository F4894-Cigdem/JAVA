package J32_Abstract.Ornek3;

public class YemekDunyasiMain {
    public static void main(String[] args) {


        Baklava bklv = new Baklava();
        bklv.madeIn();
        bklv.taste();
        System.out.println("bklv = " + bklv);


        CheeseCake chc = new CheeseCake();
        chc.madeIn();
        chc.taste();
        System.out.println("chc = " + chc);

        SezarSalad sld = new SezarSalad();
        sld.madeIn();
        sld.taste();
        System.out.println("sld = " + sld);

        GreekSalad gsld=new GreekSalad();
        gsld.madeIn();
        gsld.taste();
        System.out.println("gsld = " + gsld);
    }
}
