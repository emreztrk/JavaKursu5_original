package Gun10;

import java.util.Scanner;

public class _04_Mantiksal_Ifadeler {
    public static void main(String[] args) {

        // mantıksal ifadeler
        // && "ve" işaretimiz
        // || "veya" işaretimiz   (alt gr + <)

        // girilen sayı pozitif ve tek ise ekrana uygun sayıgirildi değilse uygun sayı girilmedi yazdınrız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Enter Number=");
        int sayi= oku.nextInt();

        // hem tek hem pozitif -> sayi%2 == 1 && sayi > 0

        if (sayi%2==1 && sayi >0)
            System.out.println("uygun sayı girildi");
        else
            System.out.println("uygun sayı GİRİLMEDİ");





    }
}
