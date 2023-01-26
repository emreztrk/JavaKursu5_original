package Gun26._04_Ornek;

public class EnerjiSA {
    public static void main(String[] args) {

        Musteri cus = new Musteri();
        cus.name = "Emre Öztürk";
        cus.elektrikHesabi=new ElektrikHesabi();

        cus.elektrikHesabi.tuketimEkle(50);
        cus.elektrikHesabi.tuketimEkle(60);
        cus.elektrikHesabi.tuketimEkle(70);
        cus.elektrikHesabi.toplamTuketimYaz();

        cus.elektrikHesabi.faturaYaz(cus.name);

    }

}
