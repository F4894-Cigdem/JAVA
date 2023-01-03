package J18_Constructer;

public class C05_Arac {
    //Fields->objenin üretilirken alacağı değer variables
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */

    int maxHiz;
    String model;

    public C05_Arac(int maxHiz, String model) {// 2p'li cons
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("burayı okuduysan 2p'li cons. call edilmiştir:)");

    }

    public C05_Arac(int maxHiz) {//1p'li cons.

        this(180,"hacıMurat");
        this.maxHiz = maxHiz;
        System.out.println("bu sefer de 1p'li cons call edildi");
    }
    public C05_Arac() {// p'siz cons.

    }
}
