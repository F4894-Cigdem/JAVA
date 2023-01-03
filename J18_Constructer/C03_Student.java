package J18_Constructer;

public class C03_Student {//main olmayan sadece student obje create etmek için pojo->plan old java object : obj için standart class
    //fields->
    String ad;
    String soyad;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdir;
    public void mezuniyet() {
        if (ortalama >=50) {
            System.out.println("agam diploman hayırlı nolsun:)");
        }else System.out.println("agam seneye de bekleriz dewamkee:(");

    }
    @Override
    public String toString() {//obj referans değeri print etmemesi için obj datalarını  stringe ceviren method
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                '}';
    }




}
