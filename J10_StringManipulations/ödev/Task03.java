package J10_StringManipulations.ödev;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

        String str = "Alamanya";

       // str.indexOf('a')-> ilk a'nın index'ini verir
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));

    }
}
