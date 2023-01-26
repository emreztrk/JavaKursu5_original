package _HomeWorks_;

import java.util.Scanner;

public class _02_Odev2_14Kasim {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("adınız=");
        String ad=oku.next();
        System.out.println("ad = " + ad);

        System.out.print("sayı giriniz=");
        int sayi= oku.nextInt();
        System.out.println("sayi = " + sayi);

        System.out.print("sevdiğiniz meyve=");
        String meyve= oku.next();
        System.out.println("meyve = " + meyve);

        System.out.print("araç kapı sayısı=");
        int kapi= oku.nextInt();
        System.out.println("kapi = " + kapi);

        System.out.print("10 sene önce yaşadığınız şehir=");
        String sehir= oku.nextLine();
        System.out.println("sehir = " + sehir);

        System.out.print("Doğum Günü=");
        String dogum= oku.next();
        System.out.println("dogum = " + dogum);

        System.out.print("Banka Hesabınız Var Mı?=");
        boolean var_mi=oku.nextBoolean();
        System.out.println("hesap durumu = " + var_mi);


        System.out.print("Ağırlık(kg)=");
        byte kilo= oku.nextByte();
        System.out.println("kilo = " + kilo);

        System.out.print("Boyunuz=");
        float boy= oku.nextFloat();
        System.out.println("boy = " + boy);










    }
}
