package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
        // kisi1.ad="Emre";
        // kisi1.soyad="Öztürk";
        // kisi1.yas=-25; // böyle yazarsa bunu düzeltmek için yasAta metodunu yazdırdık, private yazdıktan sonra
        // erişilemez oldu.
        kisi1.setAd("Emre");
        kisi1.setSoyad("Öztürk");
        kisi1.yasAta(-25); // bu şekilde olunca hatayı else de yazdırdık ve yaşı atamadı,
        // -(eksi) yi kaldırsaydık yaşı normal bir şekilde atayabilecekti.

        System.out.println("kisi1 = " + kisi1);

        System.out.println(kisi1.yasVer());

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gönderme ve alma
        // işlemine Encapsulation denir.
    }
}
