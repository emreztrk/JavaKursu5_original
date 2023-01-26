package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {

        // girilen öğrenci notuna göre 50 den büyük ise geçtiniz, küçük ise kaldınız yazdırın.

        Scanner oku=new Scanner(System.in);

        System.out.print("Öğrenci notu=");
        int not= oku.nextInt();

        if (not>=50)
            System.out.println("Ders Durumu= GEÇTİNİZ");

        if (not<50)
            System.out.println("Ders Durumu= KALDINIZ");




    }
}
