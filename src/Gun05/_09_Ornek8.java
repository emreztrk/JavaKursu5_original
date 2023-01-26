package Gun05;

import java.util.Scanner;

public class _09_Ornek8 {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner oku= new Scanner(System.in);

        System.out.print("ağırlık=");
        double agirlik=oku.nextDouble();


        System.out.print("boy=");
        double boy= oku.nextDouble();

        System.out.println("boy = " +boy+", kilo="+agirlik);

        double indeks= agirlik / (boy*boy);
        System.out.println("indeks = " + indeks);






    }
}
