package _HomeWorks_16Ocak_OOP_Abstract.Soru4;

public abstract class Data {

    abstract public  double getArea();

    public static final double PI = 3.14;

    private int radius;
    private int length;
    private int width;

    public Data(int radius) {
        setRadius(radius);

    }

    public Data(int length, int width){
        setLength(length);
        setWidth(width);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
