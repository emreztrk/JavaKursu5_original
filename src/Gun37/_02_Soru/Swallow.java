package Gun37._02_Soru;

public class Swallow extends Animal implements IFlying{
    public Swallow(String yasamAlani, String turu) {
        super(yasamAlani, turu);
    }

    @Override
    public String food() {
        return "böcek türleri ile beslenir";
    }

    @Override
    public String flies() {
        return "hafif gövdesi hızlı uçmasını sağlar";
    }
}
