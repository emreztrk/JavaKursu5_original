package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        //Tek seferde girilen bir ad soyadın adını ve soyadını ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Tam Ad=");
        String adSoyad= oku.nextLine();

        int boslukIndex=adSoyad.indexOf(" ");

        String ad=adSoyad.substring(0, boslukIndex);
        String soyad=adSoyad.substring(boslukIndex+1);  //2. indexi vermezsen sonuna kadaar alır

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);








    }
}
