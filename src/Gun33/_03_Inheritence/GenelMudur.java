package Gun33._03_Inheritence;

public class GenelMudur extends Calisan{
    private double tazminat;

    public GenelMudur(String isim, double maas, double maasKatSayisi, int tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim= " + getIsim() +
                "\tmaas= " + getMaas() +
                "\tmaasKatSayisi=" + getMaasKatSayisi() +
                "\ttazminat= " + tazminat +
                "\tÖdenecek Maaş= " + maasHesapla() +
                '}';
    }
}

