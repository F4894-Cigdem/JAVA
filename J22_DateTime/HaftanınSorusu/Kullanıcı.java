package J22_DateTime.HaftanınSorusu;

import java.time.LocalDateTime;

public class Kullanıcı {
        String name;
        LocalDateTime kayitZamani;

    public Kullanıcı(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}

