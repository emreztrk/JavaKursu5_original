package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        // kullanıcın gireceği 2 sayının birbirine eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz=");
        int sayi1= oku.nextInt();

        System.out.print("2. Sayıyı Giriniz=");
        int sayi2= oku.nextInt();

        System.out.println("Eşitlik Durumu="+" "+(sayi1==sayi2));

        boolean esitMi=(sayi1==sayi2);  //2.yöntem
        System.out.println("esitMi = " + esitMi);







    }
}
