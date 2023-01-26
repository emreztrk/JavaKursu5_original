package Gun37._02_Soru;

public class Animal {
    private String yasamAlani;
    private String turu; // memeli veya omurgalı, omurgasız falan

    public Animal(String yasamAlani, String turu) {
        this.yasamAlani = yasamAlani;
        this.turu = turu;
    }

    public String getYasamAlani() {
        return yasamAlani;
    }

    public void setYasamAlani(String yasamAlani) {
        this.yasamAlani = yasamAlani;
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "yasamAlani='" + yasamAlani + '\'' +
                ", turu='" + turu + '\'' +
                '}';
    }
}
