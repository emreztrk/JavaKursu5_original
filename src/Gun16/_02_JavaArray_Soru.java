package Gun16;

import java.util.Scanner;

public class _02_JavaArray_Soru {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        Scanner sc=new Scanner(System.in);

        int[] notlar=new int[5];
        int toplam=0;

        for (int i=0; i<notlar.length;i++){
            System.out.print("Notu Giriniz=");
            notlar[i]= sc.nextInt();

            toplam=toplam+ notlar[i];
        }

        int ort=toplam/notlar.length;
        int gecenler=0;

        for (int i=0; i<notlar.length; i++){

            if (notlar[i] > ort){
                System.out.println("notlar = " + notlar[i]);
                gecenler++;
            }
        }
        System.out.println("ort = " + ort);
        System.out.println("gecenler = " + gecenler);
    }
}
