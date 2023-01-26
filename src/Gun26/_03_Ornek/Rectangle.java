package Gun26._03_Ornek;

public class Rectangle {
    int width;
    int length;

    public void getCevre() {
        System.out.println("Çevre = " + 2 * width + 2 * length);
    }

    public void getAlan() {
        System.out.println("Alan = " + width * length);
    }
}
