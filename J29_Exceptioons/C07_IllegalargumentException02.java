package J29_Exceptioons;

public class C07_IllegalargumentException02 {
    public static void main(String[] args) {
        try {
            System.out.println("try block başından selam :)");
            hata();
            System.out.println("try block sonundan selam :)");
        } catch (IllegalArgumentException e) {
            System.out.println("catch block başından selam :)");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("catch block sonundan selam :)");

        }
        System.out.println("sorun handle edildi devaammm:)");
    }//main sonu

    public static void hata() {
        throw new IllegalArgumentException("Yine mi hata :(");
    }
}
