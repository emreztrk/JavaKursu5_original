package Gun32._02_Encapsulation;

public class ArabaMain {
    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.
    public static void main(String[] args) {

        Araba car1=new Araba();
        car1.setKapiSayisi(5); // parantez içerisine scanner ile alabilirdik sc.nextInt()
        car1.setModel(2022);
        car1.setColor("kırmızı");
        car1.setHacim(1599);
        System.out.println("car1 = " + car1);

        Araba car2=new Araba("Red", 2030, 1600, 4);
        System.out.println("car2 = " + car2);

        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.



    }
}
