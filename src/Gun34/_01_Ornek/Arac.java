package Gun34._01_Ornek;

public class Arac {
    private String renk;
    private double motorHacmi;
    private String marka;

    public Arac(String renk, double motorHacmi, String marka) {
       setRenk(renk);
       setMotorHacmi(motorHacmi);
       setMarka(marka);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", marka='" + marka + '\'' +
                '}';
    }
}
