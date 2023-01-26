package Gun11;

import java.util.Scanner;

public class _02_IfElse_Otopark {
    public static void main(String[] args) {

        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Park Edilen Süre=");
        int sure= oku.nextInt();

        if (sure <=3)
            System.out.println("10 TL");    // 2 verirsen else e girmeden sistemden çıkar
        else
            if (sure>3 && sure<=5)          // 4 verirsen 3ten büyük old. için else girer ve 5ten kçk old. için
                                            // 15tl yazar.sure>3 e gerek yok bundan dolayu
                System.out.println("15");
            else
                System.out.println("20");


    }
}
