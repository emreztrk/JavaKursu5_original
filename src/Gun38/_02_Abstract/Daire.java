package Gun38._02_Abstract;

public class Daire extends Sekil {
    private double r;

    public Daire(double r) {
        this.r = r;
    }

    double alan(){
        return Math.PI*r*r;
    }

    double cevre(){
        return Math.PI*r*2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
