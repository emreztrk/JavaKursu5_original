package Gun34._01_Ornek;

public class AracPark_Main {
    // 1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
    // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
    // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
    // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
    //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.
    public static void main(String[] args) {

        Otobus o1=new Otobus("siyah", 4.900, "Mercedes",  50);
        System.out.println("o1 = " + o1);

    }
}
