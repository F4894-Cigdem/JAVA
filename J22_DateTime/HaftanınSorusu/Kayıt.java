package J22_DateTime.HaftanınSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı>kullaniciKisiler=new ArrayList<>();



  public ArrayList<Kullanıcı> KayıtAl() {
      Scanner sc=new Scanner(System.in);
      System.out.println("adınızı giriniz : ");
      String ad=sc.nextLine();
      Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());
      kullaniciKisiler.add(k1);

      return kullaniciKisiler;
  }



}
