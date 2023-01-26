package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //şu ana kadar sayıları birbirine çevirdik
        //yazıların rakamlara çevirlmesi, rakamların da yazıya dönüşmesi olayı var

        String ad="emre";
        String kelimeSayi="65"; //string halde, toplama gibi bir işleme giremez.

        int sayiDeger= Integer.parseInt(kelimeSayi); //sayıya dönüşür

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        //toplam şuanda int yani sayı, bunu String e nasıl dönüştürüm
        String strToplam= Integer.toString(toplam); //String e dönüştürür
        System.out.println("strToplam = " + strToplam);



    }
}
