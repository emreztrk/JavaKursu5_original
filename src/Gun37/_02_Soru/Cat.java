package Gun37._02_Soru;

public class Cat extends Animal implements ILand{

    public Cat(String yasamAlani, String turu) {
        super(yasamAlani, turu);
    }

    @Override
    public String food() {
        return "kediler fareleri yer.";
    }

    @Override
    public String runs() {
        return "kediler atletik koşuculardır.";
    }
}
