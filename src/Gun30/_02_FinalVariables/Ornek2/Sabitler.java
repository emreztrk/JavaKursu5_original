package Gun30._02_FinalVariables.Ornek2;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaattekiDakSayisi=60;
    final static int birDakikadakiSanayisi=60;


    public static int hesapla(int gun, int saat, int dak)
    {
       int toplamSaniye=
               gun
               * Sabitler.birGundekiSaatSayisi
               * Sabitler.birSaattekiDakSayisi
               * Sabitler.birDakikadakiSanayisi
               +
               saat
               * Sabitler.birSaattekiDakSayisi
               * Sabitler.birDakikadakiSanayisi
               +
               dak
               * Sabitler.birDakikadakiSanayisi;

       return toplamSaniye;
    }


}
