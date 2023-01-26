package Gun39._05_OOP_Soru;

public class AdanaKebap implements IFood{
    @Override
    public void taste() {
        System.out.println("Etin en güzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 75;
    }

    void marine(){
        System.out.println("et dünden özel baharatlarla terbiye edildi");
    }

    void grill(){
        System.out.println("kömür ateşinde yavaş pişirildi");
    }
}
