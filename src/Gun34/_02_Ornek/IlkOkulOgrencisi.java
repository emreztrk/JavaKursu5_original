package Gun34._02_Ornek;

public class IlkOkulOgrencisi extends Ogrenci{
    private String kulup;

    public IlkOkulOgrencisi(String isim, OgrTip tipi, String kulup) {
        super(isim, tipi);
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
