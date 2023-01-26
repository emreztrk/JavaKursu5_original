package Gun37._02_Soru;

public class Shark extends Animal implements ISailing{
    public Shark(String yasamAlani, String turu) {
        super(yasamAlani, turu);
    }

    @Override
    public String food() {
        return "köpek balıkları birçok balığı avlar.";
    }

    @Override
    public String swims() {
        return "yüzgeçleri sayesinde hızlı yüzerler";
    }
}
