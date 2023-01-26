package Gun10;

import java.util.Scanner;

public class _03_IfElse_Soru {
    public static void main(String[] args) {

        // gririlen bir sayının tek mi çift mi old. yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.print("Enter Number=");
        int number= read.nextInt();

        int kalan= number % 2;

        if (kalan==0)
            System.out.println("Çift");  //0 durumunda yapılacaklar

        else                            // !=0 yani yukarıdaki değilse =-1 ya da 1
            System.out.println("Tek");





    }
}
