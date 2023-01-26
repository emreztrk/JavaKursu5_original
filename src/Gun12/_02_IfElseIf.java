package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner sc=new Scanner(System.in);
        Scanner scSTR=new Scanner(System.in);
        System.out.print("1.Sayi=");
        int sayi1= sc.nextInt();

        System.out.print("2.Sayi=");
        int sayi2= sc.nextInt();

        int T=sayi1+sayi2;
        int C=sayi1-sayi2;
        int P=sayi1*sayi2;
        int B=sayi1/sayi2;

        System.out.print("İfade Giriniz=");
        String ifade=scSTR.next();

        // merdivenli if, ladder if
        if (ifade.equalsIgnoreCase("T"))
            System.out.println("Toplam = " + T);
        else
            if (ifade.equalsIgnoreCase("C"))
            System.out.println("Çıkarma = " +C);
            else
                if (ifade.equalsIgnoreCase("P"))
            System.out.println("Çarpma = " + P);
                else
                    if (ifade.equalsIgnoreCase("B"))
                        System.out.println("Bölme = " + B);



    }
}
