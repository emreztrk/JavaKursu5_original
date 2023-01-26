package Gun33._02_Inheritence;

public class HayvanatBahcesi {
    // Bir hayvanat bahçesi için bir program yazılmak isteniyor.
    //Kediler için (renk,kilo,cinsi)
    //kopekler için (renk,kilo, cinsi)
    //yılanlar için renk, kilo, cinsi, uzunluk)
    //ordek için (renk, kilo, cinsi, kanatAcikligi)
    //bütün hayvanların konustu metodu vardır.(ses çıkardı)
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("beyaz", 50, "kangal");
        kopek1.konustu();

        Kedi kedi1=new Kedi("turuncu", 25, "sarman");
        kedi1.konustu();

        Ordek ordek1=new Ordek("siyah", 3 , "gövel",90);
        ordek1.konustu();

        Yilan yilan1=new Yilan("yeşil", 25, "piton", 120);
        yilan1.konustu();

    }
}
