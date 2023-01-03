package J36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */

        Map<String,String> semihKartvizit=new HashMap<>();
        semihKartvizit.put("isim","Semih Nerde");
        semihKartvizit.put("email","Semih@hotmail.com");
        semihKartvizit.put("adres","Frankfurt/Almanya");
        semihKartvizit.put("telefon","0 532 2300000");

        Map<String,String> ismailKartvizit=new HashMap<>();
        ismailKartvizit.put("isim","İsmail Demir");
        ismailKartvizit.put("email","ismail@gmail.com");
        ismailKartvizit.put("adres","Amsterdam/Hollanda");
        ismailKartvizit.put("telefon","0 546 4500000");

        Map<String,String>kartvizitler=new HashMap<>();
        kartvizitler.put("semih", semihKartvizit.toString());
        kartvizitler.put("ismail",ismailKartvizit.toString());

        System.out.println("kartvizitler.get(\"semih\") = " + kartvizitler.get("semih"));
        System.out.println("kartvizitler.get(\"ismail\") = " + kartvizitler.get("ismail"));



    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
