package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad = "Emre"; // string: kelime veya kelimeleri saklamak için kuallanılır.
        // sınırlarını "" ile belirlenir.

        String soyad = "Öztürk";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad+soyad = " + ad + "\t" + soyad);
        // + lar burada string ifadesinde bitiştirme yapar.

        String tamAd = "Cihan" + " " + "Emre" + " " + "Öztürk";
        System.out.println("tamAd = " + tamAd);

    }
}
