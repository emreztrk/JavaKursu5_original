package Gun39._05_OOP_Soru;

public class Borsh implements IFood{

    @Override
    public void taste() {
        System.out.println("Sıcak sebze çorbası");
    }

    @Override
    public double ucret() {
        return 0;
    }

    void boil(){
        System.out.println("kısık ateşte kaynatılıyor");
    }

    void eatTomorrow(){
        System.out.println("bir gün sonra servis edilir.");
    }
}
