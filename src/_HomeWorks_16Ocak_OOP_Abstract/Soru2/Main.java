package _HomeWorks_16Ocak_OOP_Abstract.Soru2;

import com.sun.org.apache.xpath.internal.operations.Mult;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("1. Sayı giriniz= ");
        int sayi1= sc.nextInt();

        System.out.print("2. Sayı giriniz= ");
        int sayi2= sc.nextInt();

        Sum s=new Sum();
        System.out.println("Toplama = "+s.calculating(sayi1,sayi2));

        Divide d=new Divide();
        d.calculating(sayi1,sayi2);
        System.out.println("Bölme = "+d.calculating(sayi1,sayi2));

        Multiply m=new Multiply();
        m.calculating(sayi1,sayi2);
        System.out.println("Çarpma = "+m.calculating(sayi1,sayi2));

        Substract c=new Substract();
        c.calculating(sayi1,sayi2);
        System.out.println("Çıkarma = "+c.calculating(sayi1,sayi2));

    }
}
