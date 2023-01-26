package Gun10;

import java.util.Scanner;

public class _06_IfElse_Soru {
    public static void main(String[] args) {

        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Password=");
        String pass= oku.nextLine();

        int uzunluk=pass.length();
        boolean varMi=pass.toLowerCase().contains("pass");

        if (uzunluk >=8 && uzunluk <=12 && varMi==false )
            System.out.println("UYGUN1");
        else
            System.out.println("GEÇERSİZ1");

        //2. yöntem
        if (pass.length() >=8 && pass.length() <=12 && pass.toLowerCase().contains("pass")==false)
            System.out.println("UYGUN2");
        else
            System.out.println("GEÇERSİZ2");

        //3 . yöntem
        if (pass.length() >=8 && pass.length() <=12 && !pass.toLowerCase().contains("pass")) //false kaldırdık ! koyduk.
            System.out.println("UYGUN3");
        else
            System.out.println("GEÇERSİZ3");


    }
}
