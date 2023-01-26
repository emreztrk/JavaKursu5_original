package Gun19;

public class _05_JavaMethod {

    // buraya methodlar yazılabılır
    public static void main(String[] args) { // ana method, diğer methodlar ıburaya çağıracağız
        Math.max(5,6);  //bir şeyler verilmiş, geriye değer alınıyor
        Math.random();  //veri almıyor, sadece veri verir.

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        System.out.println();

        merhabaYaz();// kullanımı kolay, çağırması kolay, tekrar tekrar kulanabilirsin
        merhabaYaz();// mainin daha kolay anlaşılabilir olur.
        merhabaYaz();// fonksiyonu çağırma şekli


    }
    public static void merhabaYaz(){    // buraya methodlar yazılabilir
        System.out.println("Merhaba Dünya");

        // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
        // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
        // temiz kod için

    }
}
