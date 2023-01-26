package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {

    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {

        int gun;
        int saat;
        int dak;

        Scanner sc=new Scanner(System.in);
        System.out.print("Gun= ");  gun=sc.nextInt();
        System.out.print("Saat= "); saat=sc.nextInt();
        System.out.print("Dakika= "); dak=sc.nextInt();

        // 1.Yöntem
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
        System.out.println("toplamSaniye = " + toplamSaniye);

        // 2.Yöntem
        System.out.println("Toplam Saniye = " + Sabitler.hesapla(gun,saat,dak));

    }

}
