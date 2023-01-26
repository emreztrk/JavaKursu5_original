package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi=0;     // 1 tane sayı
        int[] dizi=new int[100];    // 100 sayı

        int[] ders1Notlari=new int[50]; //50 kişilik sınıfın 1.dersin notları
        int[] ders2Notlari=new int[50];
        int[] ders3Notlari=new int[50]; // 0-49 arası index değişiyor

        int[][] tumDersNotlari=new int[3][50];  // 3 tane ders 50 tane öğrenci, 150 tane sayı

        //3 satır 50 sutün
        //Her satırda 50 tane sayı, 50 sutün
        // 0. Satır, 1.Satır, 3.Satır
        //Satır: 0,1,2      Sutün:0,1,2,3,......49

        ders1Notlari[0]=80;      // tek boyutlu dizinin ilk(0) elemanına 80 değerini atadım
        tumDersNotlari[0][0]=80; // 2 boyutlu dizide 0. satırın, 0 sutünuna 80 değeri atandı

        System.out.println("tumDersNotlari = " + tumDersNotlari[0][0]);

        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0]= oku.nextInt();
    }
}
