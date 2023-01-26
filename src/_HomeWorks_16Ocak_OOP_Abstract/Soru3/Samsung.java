package _HomeWorks_16Ocak_OOP_Abstract.Soru3;

public class Samsung extends Phone{
    @Override
    public void options(String a, String b) {
        if (a.equalsIgnoreCase("256GB") && b.contains("5.5"))
            cart.add("$1000");
        if (a.equalsIgnoreCase("256GB") && b.contains("7.5"))
            cart.add("$1200");
        if (a.equalsIgnoreCase("512GB") && b.contains("5.5"))
            cart.add("$1300");
        if (a.equalsIgnoreCase("512GB") && b.contains("6.5"))
            cart.add("$1400");
    }
}
