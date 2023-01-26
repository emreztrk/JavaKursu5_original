package Gun38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {

        Baklava b=new Baklava();
        b.madeIn();
        b.taste();
        System.out.println("----------");

        CheeseCake cc=new CheeseCake();
        cc.madeIn();
        cc.taste();
        System.out.println("----------");

        GreekSalad g=new GreekSalad();
        g.madeIn();
        g.taste();
        System.out.println("----------");

        SezarSalad s=new SezarSalad();
        s.madeIn();
        s.taste();

    }
}
