package J10_StringManipulations.Tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime=scan.nextLine();
        System.out.println(kelime.substring(0,kelime.length()/2));







    }
}
