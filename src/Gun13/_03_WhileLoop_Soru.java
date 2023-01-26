package Gun13;

import java.util.Scanner;

public class _03_WhileLoop_Soru {
    public static void main(String[] args) {

        // girilen 5 sayının toplamını sonucunu yaz.

        Scanner sc=new Scanner(System.in);

        int sayac=0;
        int toplam =0;

        while (sayac<=5) {

            System.out.print("sayı giriniz=");
            int sayi= sc.nextInt();
            toplam=toplam+sayi;
            sayac++;

        }
        System.out.println("toplam = " + toplam);


    }
}
