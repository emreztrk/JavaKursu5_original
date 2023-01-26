package Gun08;

import java.util.Scanner;

public class _07_Soru2 {
    public static void main(String[] args) {

        //gririlen bir sayının tek sayı olup olmadıgını yazdırnız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayı Giriniz=");
        int sayi = oku.nextInt();

        // bir sayının 2 ye bölümünden kalan sayı 1 ise sayı tektir, 1003 3 5 100009

        int kalan = sayi % 2; //bu 1 e eşitse tektir

        System.out.println("tek mi?=" + " " + (kalan == 1));


    }
}
