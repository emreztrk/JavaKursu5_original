package _HomeWorks_16Ocak_OOP_Abstract.Soru4;

public class Rectangle extends Data{
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }
}
