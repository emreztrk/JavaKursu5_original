package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        
        //1.Yol
        Ogrenci ogr1=new Ogrenci(); // nesne oluşma anı,
        ogr1.id=1;  // özelliklerinin değerini veriyoruz.
        ogr1.ad="Emre";
        ogr1.soyad="Öztürk";
        ogr1.sinifi=5;
        
        //2.Yol
        Ogrenci ogr2=new Ogrenci(2,"mehmet","yılmaz",5);
        System.out.println("ogr2.ad = " + ogr2.ad);

        //3.Yol
        Ogrenci ogr3=new Ogrenci(2,"Ayşe","Bayrak");

    }
}
