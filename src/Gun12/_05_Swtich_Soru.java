package Gun12;

import java.util.Scanner;

public class _05_Swtich_Soru {
    public static void main(String[] args) {

    // daha önce çözdüğünüz hesap makinesi sorunu, switch ile çöznüzü.

        Scanner sc=new Scanner(System.in);
        Scanner scSTR=new Scanner(System.in);
        System.out.print("1.Sayi=");
        int sayi1= sc.nextInt();

        System.out.print("2.Sayi=");
        int sayi2= sc.nextInt();

        System.out.print("Seçiminiz=");
        String secim=scSTR.next();

        switch (secim.toUpperCase())
        {
            case "T": System.out.println("toplam="+(sayi1+sayi2)); break;
            case "Ç": System.out.println("çıkarma="+(sayi1-sayi2)); break;
            case "P": System.out.println("çarpma="+(sayi1*sayi2)); break;
            case "B": System.out.println("bölme="+((double)sayi1/sayi2)); break;
            default: System.out.println("hatalı değer");




        }

    }
}
