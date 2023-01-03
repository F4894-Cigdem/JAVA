package J32_Abstract;

public class C01_Abstract {
    /*
    1- Bazı durumlarda child class'lar parent class'daki methodların genellikle body'lerine değiştirerek override ederler.
      Bu gibi durumlarda parent class'daki method'a body tanımlamak ram ve memory açısında gereksizdir
      Çözüm olarak java, parent class'a body'siz -> abstract(soyut) methodlar tanımlamıştır

    2- Parent Class'daki abs methodlar app güvenliği açısından child class'da override edilmek zorundadır
    eğer parent class'daki child class'ın mutlaka kullanması gereken method varsa abs tanımlanmalı
    motor() her aracda olmalı.

    3- abstract method tanımlamak  için
      a) {} body olmaz
      b) access modief sonrası abstract keyword kullanılmalı
      abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.

    4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.
            ama abs class'da concerete emthod tanımlanabilir

    5- Abs class içinde hem obs method hem de concrete method ve variable tanımlanabilir

    6- Bir concrete child class parent abs class extend ettiğinde abs method'ları implement etmek zorunda
    ama concrete methodlar isteğe göre override edilir

    7-Parent child ilişkisi olan abs class'lar abs method'ları implement etmek zorunda değil
    8- parent olan abs class birden çok concrete veya abs child class extends edilebilir
    ancak child class birden fazla abs parent class'dan extends e-de-mezz...

    9- Abs class'da final ve abs method tanımlanamaz CTE -> final method override edilmeyecegi için abs olamaz

    10-Abs class'da  private ve abs method otanımlanamaz CTE -> private method override edilmeyecegi için abs olamaz

    11-Abs class'da  static ve abs method otanımlanamaz CTE -> static method override edilmeyecegi için abs olamaz

    ****** ABSTRACT CLASS ASLA KESİNLİKLE OBJE ÜRETEMEZ******
     TRİCK-> Abstract Class'lar referansı child Class'ın obj tutabilir(Polimorphism)











     */

}
