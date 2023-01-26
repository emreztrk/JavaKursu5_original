package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // kullanıcının 2 kez gireceği şifresinin aynı oldugunu aynı veya değil şeklinde cevaplayınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Şifrenizi Giriniz=");
        String sifre = oku.nextLine();

        System.out.print("Şifrenizi Yeniden Giriniz=");
        String sifre2 = oku.nextLine();

        boolean ayni=sifre.equals(sifre2);
        if (ayni==true)
            System.out.println("Şifre Aynı");
        if (ayni==false)
            System.out.println("Şifre Farklı");


    }
}
