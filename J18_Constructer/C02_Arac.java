package J18_Constructer;

public class C02_Arac {
    //Fields
    String marka;
    String model;
    int km;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yil;


    public static void main(String[] args) {
        C02_Arac arac1=new C02_Arac();//default cons ile obj1 create edildi

        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHcm=2.4;
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km +" " +arac1.ikinciEl+" "+arac1.motorHcm);

        // task -> 2. bir aracın tüm field lerini atayarak print ediniz

        C02_Arac myCar=new C02_Arac();
        myCar.ikinciEl=false;
        myCar.marka="honda";
        myCar.km=11;
        myCar.model="accord";
        myCar.motorHcm=2.0;
        myCar.vitesAuto=true;
        myCar.yil=2022;
        System.out.println(myCar.marka+" "+myCar.model+" "+myCar.km+" km "+myCar.yil+" "+myCar.ikinciEl+" "+myCar.motorHcm+" cc "+myCar.vitesAuto);



    }
}
