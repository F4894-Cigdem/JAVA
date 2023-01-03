package J24_AccessModifier.FarkliPackage;

import J24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {

    private String privateTeamLead="Hakan Aydın";
    String defaultName="Cebrail Bey";
    protected String protectedName="GamzeHanım";

    public static void main(String[] args) {

        C01_AccessModifier obj9=new C01_AccessModifier(23,63);
        System.out.println("obj9.publicYas = " + obj9.publicYas);
        //obj.defaultYas// default variable package dışı erişilmez
        //obj.protected method packet dışı call edilemez.


    }
}
