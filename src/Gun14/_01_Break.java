package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {

        // girilen bir sayının, 2 aynı sayının çarpımına eşit olup olmadıgnı bulunuz.

        Scanner read=new Scanner(System.in);

        System.out.print("Sayı Giriniz=");
        int sayi= read.nextInt();

        //5 girildi ise, 5 e kadar olan sayıları kendisi ile çarparak tam kare ifade elde etmeye çalışcak

        int sayac=0;
        boolean tamKare=false;

        while (sayac<sayi)
        {
            System.out.println("sayac = " + sayac);

            if (sayac*sayac==sayi)
            {
                tamKare=true;
                System.out.println("tam karedir");
                break;
            }

            sayac++;
        }
        if (tamKare==false)
            System.out.println("tam kare değildir.");
    }
}
