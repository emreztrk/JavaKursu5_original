package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program başladı");

        try { // dene, hatanın başladıgı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);

        }   // hata oldugu zaman programı kırma
        catch (Exception ex) {
            // ex isimli değişkende oluşan hataların bilgisi atanıyor.
            // hata oldugunda yapılması istneneler buraya yazılıyor
            System.out.println("hata oluştu, lütfen tekrar deneyiniz.");
            System.out.println("Tüm hata mesajı ="+ex);
            System.out.println("Hatanın açıklaması = "+ex.getMessage());
            // kendine hata mesajını mail atabilirsin
            // log tutma: programı nasıl çalışıyor, hara loglarını hardidiske  yazabilirsin
        }
        System.out.println("program bitti");

        try {
            //Java ve toolları çalışmaya devma et
            //Konuları öğrenemeye ve çalışmaya devam et
            //anlamadıgın yer mi oldu?, kırılmadan devam et.
        }
        catch (Exception ex){
            //hatanın sebebini anla
            //derse daha fazla odaklan
            //gereken videolari izle
            //grup çalışması yap
            //öğren ve kırılmadan devam et
            //unutma sen bir söz verdin , devam sonunda seni güzel bir meslek bekliyor.
        }
    }
}
