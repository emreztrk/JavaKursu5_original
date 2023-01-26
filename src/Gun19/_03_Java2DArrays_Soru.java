package Gun19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays_Soru {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir diziye atayınız.

        Scanner sc = new Scanner(System.in);

        int[][] tablo = new int[3][2];
        int tekMik = 0;

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("Sayı giriniz=");
                tablo[i][j] = sc.nextInt();

                if (tablo[i][j] % 2 != 0)
                    tekMik++;
            }
        }
        int[] teklerDizisi = new int[tekMik]; // teklerin miktarı kadar dizi tanımlandı

        tekMik = 0;

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {


                if (tablo[i][j] % 2 != 0) {
                    teklerDizisi[tekMik] = tablo[i][j];
                    tekMik++;
                }
            }
        }
        System.out.println(Arrays.toString(teklerDizisi));

    }
}
