package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip
        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="Emre Öztürk";

        //1. Yöntem
        ogr.okulu=new Okul();
        ogr.okulu.adi="Mehmet Akif Ersoy Okulu";
        ogr.okulu.mudurAdi="Merve Aslan";
        ogr.okulu.ucreti=50000;

        //2.Yöntem
        Okul sch=new Okul();
        sch.adi="Mehmet Akif Ersoy Okulu";
        sch.mudurAdi="Merve Aslan";
        sch.ucreti=50000;
        ogr.okulu=sch; // atama işlemini yaptık

        System.out.println("okulNo = " + ogr.okulNo);
        System.out.println("tamAd = " + ogr.tamAd);
        System.out.println("okulu.adi = " + ogr.okulu.adi);
        System.out.println("okulu.mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("okulu.ucreti = " + ogr.okulu.ucreti);

    }
}
