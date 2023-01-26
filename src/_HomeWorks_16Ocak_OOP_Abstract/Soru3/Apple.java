package _HomeWorks_16Ocak_OOP_Abstract.Soru3;

public class Apple extends Phone{

    @Override
    public void options(String a, String b) {
        if (a.equalsIgnoreCase("64GB") && b.contains("5.5"))
            cart.add("$750");
        if (a.equalsIgnoreCase("64GB") && b.contains("6.5"))
            cart.add("$850");
        if (a.equalsIgnoreCase("128GB") && b.contains("5.5"))
            cart.add("$950");
        if (a.equalsIgnoreCase("128GB") && b.contains("6.5"))
            cart.add("$1200");
    }

}
