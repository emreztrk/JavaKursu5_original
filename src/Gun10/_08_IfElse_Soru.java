package Gun10;

import java.util.Scanner;

public class _08_IfElse_Soru {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayılar=");
        String sayilar= oku.nextLine();

        int space=sayilar.indexOf(" ");
        int space2=sayilar.lastIndexOf(" ");

        int sayi1=Integer.parseInt(sayilar.substring(0,space));
        int sayi2=Integer.parseInt(sayilar.substring(space+1, space2));
        int sayi3=Integer.parseInt(sayilar.substring(space2+1));

        if ((sayi1+sayi2+sayi3) %2 ==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");





    }
}
