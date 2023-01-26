package Gun06;

import java.util.Scanner;

public class _06_Soru1 {
    public static void main(String[] args) {

        //girilen bir ad soyadı "İsmet Temur", I.T şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız=");
        String adSoyad= oku.nextLine();
        char adBas=adSoyad.charAt(0);

        int boslukIndex=adSoyad.indexOf(" ");

        char soyBas=adSoyad.charAt(boslukIndex+1);

        System.out.println("kısaltma= " + adBas+"."+soyBas+".");


    }
}
