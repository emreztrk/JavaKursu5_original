package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    public Ogrenci(){ // yapıcı methodlar, Constructors method
        System.out.println("nesne oluşturuldu");
    }// nesne oluşturulurken yapmak istediklerin için burayı kullan
    Ogrenci(int id, String ad, String soyad, int sinifi){
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;

        //this.id : classın id si, id: local değişken parametresi
    }
    Ogrenci(int id, String ad, String soyad) {
        this(id,ad,soyad,0); //this öğrenci metodunun kendisi

        /*this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sinifi =0; // sınıfı çıkarttık */
    }
}
