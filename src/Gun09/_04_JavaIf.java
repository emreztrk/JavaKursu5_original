package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

        // gririlen bir sayının tek mi çift mi oldgunu yazdırnız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi = oku.nextInt();
        int kalan = sayi % 2;

        if (kalan !=0)  //(kalan==1) yazdım normalde fakat bu komut eksi sayıları hesaba katmıyor.
            System.out.println("Girilen sayı tektir");

        if (kalan == 0)
            System.out.println("Girilen sayı çifttir");


    }
}
