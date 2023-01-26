package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        //byte -> short -> int -> long -> float -> double (GENİŞLETME)  (Widening Casting)
        // double -> float -> long -> int -> char -> short -> byte  (DARALTMA) (Narrowing Casting)

        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplam=ogrNot1; // byte -> int e atınca problem çıkarmadı (widening)
        // çünkü byte için hazıfaza da ayrılan, zaten int e sığar, sığdığı için kabul eder.
        //çünkü veri kaybı olma ihtimali hiç yok.

        ogrNot1= (byte)toplam; // int -> byte a atınca dur bakalım dedi (narrowing)
        // parantez içinde byte eklersen, sorunu manuel olarak halletmiş olursun.
        //büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana işlemi var.
        //veri kaybı ihtimali var.






    }
}
