package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        double kilo=60;
        int boy=177;

        double indeks= kilo / (boy*boy);
        System.out.println("indeks = " + indeks);
        System.out.println("boyunuz="+boy+", kilonuz="+kilo);

        /*****************/ //boy da int yerine double kullandığımız version asagıda
        double boy2=1.77;
        double kilo2=60;
        double indeks02= kilo2 / (boy2*boy2);
        System.out.println("indeks02 = " + indeks02);

    }
}
