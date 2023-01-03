package J99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {
    public C12_textRead() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        //TASK01--> Cigdem dosyasını okuyunuz. (consolo print ediniz.
        Path cgdm = Path.of("src/J99_Lambda/cigdem");
        Stream<String> akis = Files.lines(cgdm);

        akis.//erişimi verilen dosyadaki satırlar akışa alındı
                forEach(System.out::println);
        //akışdaki satırlar print edildi
        ////TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        Files.lines(Paths.get("src/J99_Lambda/cigdem")).map(String::toUpperCase).forEach(System.out::println);
        // Files.readAllLines(cgdm).stream().map(String::toUpperCase).forEach(System.out::println);

        //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..

        System.out.println("\n TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz.. ");

        Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                map(String::toLowerCase).//akısdaki  satırların Stringleri kck hrf update edildi
                limit(1).//akısdaki ilk eleman(ilk satır) alındı
                //  findFirst();//akısdaki ilk eleman(ilk satır) alındı
                        forEach(System.out::println);

        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\n TASK 04 --> haluk dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print ediniz.");

        System.out.println(Files.lines(Paths.get("src/J99_Lambda/haluk")).//erişim verilen path deki saırlar akısa alındı
                map(String::toLowerCase).//akısdaki  satırların Stringleri kck hrf update edildi
                filter(t -> t.contains("basarı")).//akısdaki elemanların basarı içerenleri filtrelendi
                count()); //akısdaki elelmanlar saydırıldı

    }

}
