package Gun13;

import java.util.Scanner;

public class _08_DoWhile_Soru {
    public static void main(String[] args) {
        // kullanıcıdan x girilene kadar ekrana "program çalışıyor" yazdır.
        // x girildiğinde ise program bitti yazdır.

        Scanner sc=new Scanner(System.in);
        String okunan;
        do {
            System.out.print("İfade Giriniz=");
            okunan= sc.next();

            if (!okunan.equalsIgnoreCase("x"))
            System.out.println("Program Çalışıyor");

        }while (!okunan.equalsIgnoreCase("x"));

        System.out.println("Program Bitti");
    }
}
