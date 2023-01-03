package J15_Arrays.Odev;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String arr[]={"Apple,Orange,Banana,Pineapple"};

        String meyve="Apple";

        boolean flag=true;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==meyve) {
                flag=true;
            }
        }
        if (flag) {
            System.out.println("aradığınız meyve array de VAR:)");

        }
        else  {
            System.out.println("aradığınız meyve array de YOK:(");

        }









    }
}
