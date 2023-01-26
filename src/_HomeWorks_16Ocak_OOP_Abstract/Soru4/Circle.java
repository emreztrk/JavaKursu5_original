package _HomeWorks_16Ocak_OOP_Abstract.Soru4;

public class Circle extends Data{


    public Circle(int radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return PI*getRadius()*getRadius();
    }
}
