package Gun39._05_OOP_Soru;

public class Palov implements IFood{
    @Override
    public void taste() {
        System.out.println("çocukların vazgeçilmesi");

    }

    @Override
    public double ucret() {
        return 75;
    }
    void fry(){
        System.out.println("pirinç ve şehriye kavruldu");
    }
    void boil(){
        System.out.println("kısık ateşte pişirildi");
    }
}
