package _HomeWorks_16Ocak_OOP_Abstract.Soru4;

public class Main {
    public static void main(String[] args) {

        Circle c=new Circle(5);
        System.out.println("Dairenin Alanı = "+c.getArea());

        Rectangle r=new Rectangle(12,24);
        System.out.println("Dikdörtgenin Alanı = "+r.getArea());

    }
}
