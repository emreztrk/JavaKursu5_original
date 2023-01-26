package Gun32._02_Encapsulation;

public class Araba {
    private String color;
    private int model;
    private double hacim;
    private int kapiSayisi;

    public Araba(){

    }

    public Araba(String color, int model, double hacim, int kapiSayisi) {
        setColor(color);
        setModel(model);
        setHacim(hacim);
        setKapiSayisi(kapiSayisi);
        // bu şekilde yaptığımız zaman atanmadan önce kontrole gönderiyoruz.
        // aşağıdaki gibi olsaydı 2030 modeli de kabul ediyodu.
//        this.color = color;
//        this.model = model;
//        this.hacim = hacim;
//        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "color='" + color + '\'' +
                ", model=" + model +
                ", hacim=" + hacim +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model<2023)
            this.model = model;
        else
            System.out.println("hatalı model");
    }

    public double getHacim() {
        return hacim;
    }

    public void setHacim(double hacim) {
        this.hacim = hacim;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi<7)
            this.kapiSayisi = kapiSayisi;
        else
            System.out.println("hatalı kapı sayısı");
    }
}
