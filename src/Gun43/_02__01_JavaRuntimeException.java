package Gun43;

import java.util.Scanner;

public class _02__01_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("program başladı");

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Sayi1= ");
            int sayi1 = sc.nextInt();

            System.out.print("Sayi2= ");
            int sayi2 = sc.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
        }
        catch (Exception hata) {
            // hata mesajlarını hata isimli Exception cinsinden değişkene attım.
            System.out.println("hata = " + hata.getMessage());
            System.out.println("Lütfen tekrar deneyiniz.");
        }
        System.out.println("program bitti");
    }

}
