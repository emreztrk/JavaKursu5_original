package Gun33._01_Inheritence;

public class Yonetici {
    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String depertman;
    private String sicilNo;
    private String telefon;

    public void bordroYazdir(){
        System.out.println("bordro yazdırıldı.");
    }
    public void zamYap(){
        System.out.println("zam yapıldı.");
    }

    // böyle yapmak yerine yoneticiYeni classında extends ile personelde yazdıklarımızı oraya uzattık.
}
