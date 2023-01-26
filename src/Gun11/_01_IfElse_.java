package Gun11;

import java.util.Scanner;

public class _01_IfElse_ {
    public static void main(String[] args) {

        // girilen bir sayının pozitif, negatif, veya sıfır old. yazdır.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();

        if (sayi>0)
            System.out.println("pozitif");
        else
            if (sayi<0)
                System.out.println("negatif");
            else
                System.out.println("SIFIR");


    }
}
