package BTK;

public class metin {
    public static void main(String[] args) {

        String mesaj="Bugün hava çok güzel.";
        System.out.println();

        System.out.println(mesaj);
        System.out.println("Eleman sayisi :" +mesaj.length());
        System.out.println("5. eleman :" +mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("e"));











    }
}
