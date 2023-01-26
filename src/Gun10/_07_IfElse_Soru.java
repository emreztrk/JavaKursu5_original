package Gun10;

import java.util.Scanner;

public class _07_IfElse_Soru {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner oku=new Scanner(System.in);
        System.out.print("Enter Numbers=");

        String sayilar= oku.nextLine(); // 2 sayı yan yana old. için string oldu int olmaz.

        int boslukIndex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,boslukIndex);
        String strSayi2=sayilar.substring(boslukIndex+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);

        if (sayi1==sayi2)
            System.out.println("EŞİT");
        else
            System.out.println("EŞİT DEĞİL");





    }
}
