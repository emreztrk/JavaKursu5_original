package Gun14;

import java.util.Scanner;

public class _05_ForLoop_Soru {
    public static void main(String[] args) {
        // girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz.
        // 2. ilave soru: çarpımın değeri 10.000 i geçtğinde işlem sonlansın.

        Scanner sc=new Scanner(System.in);

        System.out.print("Sayı Giriniz=");
        int sayi= sc.nextInt();

        int carpim=1;

        for (int i=1; i<=sayi; i++) {
            carpim = carpim * i;


            if (carpim >= 10000) {

                System.out.println("program durduruldu");
                break;

            }
        }


        System.out.println("carpim = " + carpim);
    }
}
