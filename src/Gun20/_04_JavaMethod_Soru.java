package Gun20;

import java.util.Scanner;

public class _04_JavaMethod_Soru {
    public static void main(String[] args) {
        //kullanıcının gireceği 2 sayının toplamını bir fonksiyonda buldurup, bunun sonucunu main de yazdır.

        Scanner sc = new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz=");
        int sayi1 = sc.nextInt();

        System.out.print("2.sayıyı giriniz=");
        int sayi2 = sc.nextInt();

        int toplam=sayiToplam(sayi1, sayi2);
        System.out.println("toplam = " + toplam);


    }

    public static int sayiToplam(int s1, int s2) {
        return (s1+s2);
    }
}
