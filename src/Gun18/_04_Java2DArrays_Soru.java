package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays_Soru {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        int[][] tablo = new int[2][3];

        Scanner sc = new Scanner(System.in);


        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print("Sayı Giriniz=");
                tablo[satir][sutun] = sc.nextInt();
            }
        }
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo[satir][sutun] + "\t");
            }
            System.out.println();
        }
        int enbuyuk = tablo[0][0];
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {

                if (tablo[satir][sutun] > enbuyuk)
                    enbuyuk = tablo[satir][sutun];
            }
        }
        System.out.println("enbuyuk = " + enbuyuk);
    }
}
