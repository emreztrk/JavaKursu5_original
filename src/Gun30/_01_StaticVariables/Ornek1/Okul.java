package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
        /*Ogrenci ogr1=new Ogrenci("Emre","Öztürk","Yıldırım İlkokulu");
        Ogrenci ogr2=new Ogrenci("Mehmet","Demir","Yıldırım İlkokulu");
        Ogrenci ogr3=new Ogrenci("Ayşe","Yıldız","Yıldırım İlkokulu");
        //...
        //...
        //...
        //...
        Ogrenci ogr499=new Ogrenci("Uğur","Çolak","Yıldırım İlkokulu");
        Ogrenci ogr500=new Ogrenci("Tuğser","Bayrak","Yıldırım İlkokulu");*/

        //okul adı her seferinde yazmasına gerek yok ortak oldugu için, aşağıda örneği var

        Ogrenci ogr1=new Ogrenci("Emre","Öztürk");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Atatürk Ortaokulu";
        System.out.println("ogr1 tekrar = "+ogr1);

        Ogrenci ogr2=new Ogrenci("Ali","Yılmaz");
        System.out.println("ogr2 = " + ogr2);
        //Okul ismi atatürk olarak değiştiği için bundan sonra bu okul ismi ile gelcek.
    }
}
