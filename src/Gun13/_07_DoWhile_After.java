package Gun13;

import java.util.Scanner;

public class _07_DoWhile_After {
    public static void main(String[] args) {
        // kullanıcı 0 değeri girene kadar, girdiği sayıların toplamını bulunuz.

        Scanner sc=new Scanner(System.in);
        int sayi;
        int toplam=0;

        do {    //dögü arası şart başta olmadıgından en az 1 kez çalısır, kontrol sonda
            System.out.print("sayı giriniz=");
            sayi= sc.nextInt();
            toplam=toplam+sayi;
        }
        while (sayi!=0);
        System.out.println("toplam = " + toplam);
    }
}
