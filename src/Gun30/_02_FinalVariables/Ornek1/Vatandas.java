package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; //değiştirilemez
    //yani sade 1 kez veri atama şansı var.

    static int tcNoSayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
