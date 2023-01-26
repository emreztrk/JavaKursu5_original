package Gun34._03_Ornek;

public class IlkOkulOgrencisi extends Ogrenci {
    private String kulup;

    private static int ilkokulIdSayac=1;

    public IlkOkulOgrencisi(String isim, OgrTip tipi, String kulup) {
        super(isim, tipi, ilkokulIdSayac++);
        setKulup(kulup);
    }

    public String getKulup() {
        return kulup;
    }

    public void setKulup(String kulup) {
        this.kulup = kulup;
    }

    @Override
    public String toString() {
        return "IlkOkulOgrencisi{" +
                "kulup='" + kulup + '\'' +
                '}'+super.toString();
    }
}
