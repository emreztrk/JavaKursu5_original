package Gun11;

import java.util.Scanner;

public class _09_JavaRandom_Soru {
    public static void main(String[] args) {

        // girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız.
        // kulllanıcı bilirse tebrikler yazdır

        Scanner sc=new Scanner(System.in);
        System.out.print("Üretilecek sayı sınırı=");
        int sinir= sc.nextInt();

        int tutulanSayi=(int)(Math.random() * sinir);

        System.out.print("Tahmininiz=");
        int tahmin=sc.nextInt();

        if (tahmin == tutulanSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedin ki bilemedin ki");



    }
}
