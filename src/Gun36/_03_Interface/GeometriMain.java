package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        //ınterface lerden nesne üretilemez fakat referans tipi oluşturabilir.
        // Bu bize POLYMORPHISM sağladı.
        ICizdirir c2=new Cember();
        c2.ciz();
        // direk olarak sadece interface deki
        // isim verilmiş olan metodlara erişebilir.

        cizdirme(c);
        cizdirme(d);
    }
    public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }
}
