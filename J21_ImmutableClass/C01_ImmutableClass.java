package J21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1="murat";
        String str2="murat";

        String str3=new String("murat");
        String str4=new String("murat");

        String str5=str1+"";

        System.out.println(str1==str2);//T
        System.out.println(str1==str3);//F
        System.out.println(str1.equals(str2));//T
        System.out.println(str3==str4);//F
        System.out.println(str1==str5);//F
        System.out.println( str1.equals(str5));//T

    }
}
