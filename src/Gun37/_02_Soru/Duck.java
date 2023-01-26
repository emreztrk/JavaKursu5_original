package Gun37._02_Soru;

public class Duck extends Animal implements ISailing{
    public Duck(String yasamAlani, String turu) {
        super(yasamAlani, turu);
    }

    @Override
    public String food() {
        return "sebze ile beslenirler";
    }

    @Override
    public String swims() {
        return "perdeleri ayakları sayesinde su üstünde süzülürler.";
    }
}
