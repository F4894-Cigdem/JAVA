package J18_Constructer;

public class C07_OgretmenRunner {
        public static void main(String[] args) {
            C07_Ogrtmn hcm=new C07_Ogrtmn("SevdeNur Öğretmenim :)",11);
            System.out.println("hcm.isim = " + hcm.isim);//
            System.out.println("hcm.kıdem = " + hcm.kıdem);//
            hcm.kıdemHesapla(13);//
        }
    }

