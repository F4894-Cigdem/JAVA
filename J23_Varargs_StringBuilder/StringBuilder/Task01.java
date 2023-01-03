package J23_Varargs_StringBuilder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        /*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */

        System.out.println("tersString(\"ece\") = " + tersString("ece"));
        System.out.println("tersString(\"serhat\") = " + tersString("serhat"));
        System.out.println("isPalindrom(\"nazım\") = " + isPalindrom("nazım"));

        StringBuilder sb1=new StringBuilder("ali");
        tersSB(sb1);
        tersSB(new StringBuilder("serhat"));
        System.out.println("isPalindrom(\"ey edip adanada pide ye\") = " + isPalindrom("ey edip adanada pide ye"));


    }//main sonu
    public static String tersString (String str) {
        String stringTersi="";

        for (int i=str.length()-1; i >=0 ; i--) {
            stringTersi+=str.charAt(i);
        }
        return stringTersi;
    }
    public static void tersSB(StringBuilder sb) {
        System.out.println("sb.reverse() = " + sb.reverse());
    }

    public static boolean isPalindrom(String str) {
        if (str==null) {
            return false;
        }
        return new StringBuilder(str).reverse().toString().equals(str);
    }


}
