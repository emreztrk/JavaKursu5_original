package _HomeWorks_16Ocak_OOP_Abstract.Soru1;

public class Main {
    public static void main(String[] args) {

        Tiger t=new Tiger();
        t.talk();
        t.walk();

        System.out.println();

        Lion l=new Lion();
        l.talk();
        l.walk();

        System.out.println();

        HomeCat hc=new HomeCat();
        hc.talk();
        hc.walk();
    }
}
