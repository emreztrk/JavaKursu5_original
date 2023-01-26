package Gun05;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırnız.
        Scanner oku= new Scanner(System.in);

        System.out.print("sayi1=");
        int sayi1= oku.nextInt();

        System.out.print("sayi2=");
        int sayi2=oku.nextInt();

        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
}
