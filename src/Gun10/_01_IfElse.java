package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        // girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz, kçk ise kaldınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Notu Giriniz=");
        int ogrNot= oku.nextInt();

        //1. Yöntem (önceki)

        if (ogrNot>=50)
            System.out.println("Geçtiniz");

        if (ogrNot<50)
            System.out.println("Kaldınız");

        //2.Yöntem İf else

        if (ogrNot >= 50) { // her zaman tek bir kontrol yapar : bakalava dilimi
            System.out.println("Geçtiniz");
            System.out.println("tebrikler");
        }
        else {  //değilse yapılacaklar
            System.out.println("Kaldınız");
        }











    }
}
