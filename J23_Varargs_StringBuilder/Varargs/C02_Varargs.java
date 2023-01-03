package J23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method
         */
        int arr[]={24,42,33,19,34,45,58,38};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        System.out.println("varargsToplam = " + varargsTopla(24, 42, 33, 19, 34, 45, 58, 38));

//TRICK:varargs method parametreleri array gibi tanımladığı için
// varargs methoda parametre olarak array de verilebilir

        //task1-> array elemanları toplamı print eden code create ediniz
        //task2-> task1 varargs ile çalışınız
    }//main sonu...

    public static int arrTopla(int[] a) {//task1
        int toplam=0;
        for (int w:a) {
            toplam+=w;
        }
        return toplam;
    }

    public static int varargsTopla(int...b) {//task2
        int toplam=0;
        for (int s:b) {
            toplam+=s;
        }

        return toplam;
    }
}
