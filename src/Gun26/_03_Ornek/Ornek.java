package Gun26._03_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.
        //         (properties, fields, özellik, eleman, items) : width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
        // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

        Rectangle dortgen = new Rectangle();
        dortgen.width = 10;
        dortgen.length = 20;

        dortgen.getCevre();
        dortgen.getAlan();


    }
}
