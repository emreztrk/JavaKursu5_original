package Gun13;

import java.util.Scanner;

public class _05_WhileLoop_Soru {
    public static void main(String[] args) {

        int sayac=0;
        int toplam=0;

        // syac yerine kısaca i harfi kullanılıyor yazılım sektöüründe

        while (sayac<=100) {

            System.out.println(sayac+".sayı");

            toplam=toplam+sayac;

            sayac++;

        }
        System.out.println("toplam = " + toplam);




    }
}
