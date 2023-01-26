package Gun08;

import java.util.Scanner;

public class _08_Soru3 {
    public static void main(String[] args) {

        // girilen bir cümledeki ilk kelimeyi yazdırnız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Cümle Giriniz=");
        String cumle= oku.nextLine();

        int boslukIndex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0, boslukIndex);
        System.out.println("ilkKelime = " + ilkKelime);





    }
}
