package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        // girilen iki sayıdan büyük olanı ekrana yazdırnız. eşit ise eşit yazdırnız

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz=");
        int sayi1= oku.nextInt();

        System.out.print("2. Sayıyı giriniz=");
        int sayi2 = oku.nextInt();

        if (sayi1>sayi2)
            System.out.println("sayi 1 byüktür"+" "+sayi1);

        if (sayi1<sayi2)
            System.out.println("sayi 2 büyüktür"+" "+sayi2);

        if (sayi1==sayi2)
            System.out.println("sayılar eşit");





    }
}
