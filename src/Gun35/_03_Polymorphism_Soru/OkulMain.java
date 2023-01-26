package Gun35._03_Polymorphism_Soru;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci ogr=new Ogrenci("Emre","Öztürk","Öğrenci","5A");
        Calisan cal=new Calisan("Ali","Yılmaz","Yazilim","BIM");

        Kisi.kimlikYaz(ogr);
        Kisi.kimlikYaz(cal);

    }



}
