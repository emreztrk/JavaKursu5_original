package Gun16;

import java.util.Scanner;

public class _04_JavaArray_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner sc = new Scanner(System.in);

        int[] sayi = new int[7];
        int toplam = 0;

        for (int i = 0; i < sayi.length; i++) {
            System.out.print("Sayı Giriniz=");
            sayi[i] = sc.nextInt();

            toplam = toplam + sayi[i];
        }

        int ort = toplam / sayi.length;
        int miktar = 0;

        for (int i = 0; i < sayi.length; i++) {

            if (sayi[i] > ort && sayi[i] % 2 != 0) {

                miktar++;

                // boolean ile böyle çözebilirdik
            /*boolean tekMi=sayi[i]%2==1;
            if (sayi[i]>ort && tekMi==true){

            miktar++;*/
            }
        }
        System.out.println("ort = " + ort);
        System.out.println("miktar = " + miktar);
    }
}

