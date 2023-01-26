package Gun28._03_Constructor;

public class Bank {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Bank(){

    }

    public Bank(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Bank(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}




