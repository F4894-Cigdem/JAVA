package J14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {//main başı
        int yas=33;//main method local variable

        System.out.println("yas = " + yas);//33

        for (int i = 0; i < 7 ; i++) {//for loop başı
            System.out.println(yas+" :) ");//yas local variable aynı lokalle call edildi
            i++;//i loop variable loop içi call edildi

        }//for loop sonu
        //i=34;//lokal dışı call edilemez

        yas=35;//local variable local'inde call adildi
    }//main sonu
    // yas=48;//local dısı call edilemz


    }
