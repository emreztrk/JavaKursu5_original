package Gun14;

import java.util.Scanner;

public class _04_ForLoop_Soru {
    public static void main(String[] args) {

        // kullancının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner sc=new Scanner(System.in);

        System.out.print("Sayı Giriniz=");
        int sayi= sc.nextInt();

        int toplam=0;
        for (int i=0; i<sayi; i++)
            toplam=toplam+i;

        System.out.println("toplam = " + toplam);

    }
}
