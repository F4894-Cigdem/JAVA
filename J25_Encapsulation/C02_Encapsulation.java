package J25_Encapsulation;

public class C02_Encapsulation {

    private String name="Gamze Hanım";
    private int id=1001;

    public C02_Encapsulation() {

    }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String isimVer() {
        return name;
    }
    public int idVer() {
        return id;
    }
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id ;
    }
}
