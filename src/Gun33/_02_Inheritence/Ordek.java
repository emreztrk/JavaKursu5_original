package Gun33._02_Inheritence;

public class Ordek extends Hayvan {
    double kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi,double kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vak vak");
    }

    public double getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(double kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}
