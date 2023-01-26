package Gun13;

import java.util.Scanner;

public class _04_WhileLoop_Soru {
    public static void main(String[] args) {
        // gririlen 20 sayıdan sadece pozitif olanların toplamını bulunuz.

        Scanner sc=new Scanner(System.in);

        int sayac=0;
        int pztToplam =0;

        while (sayac<=5) {

            System.out.print(sayac+".sayı giriniz=");
            int sayi = sc.nextInt();

            if (sayi > 0)
                pztToplam = pztToplam + sayi;

            sayac++;

        }
        System.out.println("pztToplam = " + pztToplam);
    }
}
