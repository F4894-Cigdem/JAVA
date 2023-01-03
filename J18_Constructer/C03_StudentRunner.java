package J18_Constructer;

public class C03_StudentRunner {
    public static void main(String[] args) {
             C03_Student ogrc1=new C03_Student();
        ogrc1.ad="fatih";
        ogrc1.soyad="ataş";
        ogrc1.sinif=1;
        ogrc1.okulNo=1001;
        ogrc1.ortalama=77;
        ogrc1.takdir=false;

        System.out.println("ogrc1 =" +ogrc1);
        ogrc1.mezuniyet();//agam diploman hayırlı nolsun:)

        // task-> diğer bir ogrc obj ile tum field'ları atayıp print ediniz...






    }
}
