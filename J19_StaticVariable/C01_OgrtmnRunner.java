package J19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {

        C01_Ogrtmn.okul="KABATAŞ ERKEK LİSESİ";

        C01_Ogrtmn hc1=new C01_Ogrtmn("cüneyt",11);
        System.out.println("hc1.tecrube= " +hc1.tecrube);//11
        System.out.println("hc1.isim= " +hc1.isim);//cüneyt
//hc1.okul="kabadaş";//static variable obje ile call edilmezzz
        System.out.println("hc1.okul= " +hc1.okul);

        C01_Ogrtmn.okul="KABATAŞ ERKEK LİSESİ";//güneş değeri update oldu


        C01_Ogrtmn hc2=new C01_Ogrtmn("Bekir",7);
        System.out.println("hc2.tecrube= " +hc2.tecrube);//7
        System.out.println("hc2.isim= " +hc2.isim);//Bekir
//hc2.okul="kabatas";
        System.out.println("hc2.okul= " +hc2.okul);

        C01_Ogrtmn hc3=new C01_Ogrtmn("nazım",13);
        System.out.println("hc3.tecrube= " +hc3.tecrube);//13
        System.out.println("hc3.isim= " +hc3.isim);//nazım
 //hc3.okul= "gabadaş";
        System.out.println("hc3.okul= " +hc3.okul);

hc1.evlilikYildonumu();//obj ile nonstatic method call ettik.
C01_Ogrtmn.maasHesapla();//Classname ile sattic method call edildi.
hc2.maasHesapla();//obj ile static method call->bad practice




    }
}