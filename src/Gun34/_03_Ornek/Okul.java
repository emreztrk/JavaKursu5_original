package Gun34._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo=new LiseOgrencisi("Emre", OgrTip.LISE, "Sayısal");
        LiseOgrencisi lo2=new LiseOgrencisi("Cihan", OgrTip.LISE, "Sözel");
        IlkOkulOgrencisi io=new IlkOkulOgrencisi("Mehmet", OgrTip.ILK, "Satranç");

        System.out.println("lo = " + lo);
        System.out.println("lo2 = " + lo2);
        System.out.println("io = " + io);


    }
}
