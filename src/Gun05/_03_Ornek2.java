package Gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        //kullanıcıdan adıını ve soyadını ekrana yazdırınız.

        Scanner oku= new Scanner(System.in);    // okuma işemini yapacak degisken tanımlandı
        System.out.print("Adını ve Soyadınızı giriniz=");   // ekrana neyin girilecegini yazdık, bilgilendirme
        String adSoyad= oku.nextLine(); //okuma işlemi bu noktada yapılıyor
        System.out.println("adSoyad = " + adSoyad); //verinin gerçtekten okunabildiğni tekrar ekrana yazarak kontrol etti.
    }
}
