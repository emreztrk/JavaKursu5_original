package _HomeWorks_;

public class _07_Odev7_6Aralik {
    public static void main(String[] args) {

        // 1- 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir._

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 1)
                continue;
            System.out.println(i + ".sayi = " + i);
        }

        //----------------------------------------------------------------------------------------------------------//

        // 2- 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.
        for (int i = 0; i <= 100; i++) {

            if (i%2==0)
                continue;
            System.out.println(i+".sayi = " +i);

            // i+=2 değeri ile de tek şekilde artırabilirdik ama i başlangıçta 1 e eşit olmalı.
        }

        //----------------------------------------------------------------------------------------------------------//

        // 3- # 100'den 0'a kadar bütün tek sayıları yazdırınız.
        for (int i = 99; i>0; i--) {

            if (i%2==0)
                continue;
            System.out.println(i+".sayi = " +i);
        }

        //----------------------------------------------------------------------------------------------------------//

        // 4- İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

        int toplam=0;
        for (int i =1; i<=10; i++) {

            toplam=toplam+i;
            System.out.println("toplam = " + toplam);
        }

        //----------------------------------------------------------------------------------------------------------//

        // 5- **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.
        //Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı. Eğer sayı çift sayıysa;
        //**This number is even and number is 0**. Eğer sayı tek sayıysa;
        //**This number is odd and number is 1** yazdırmalıdır.

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0)
                System.out.println("This Number is even and number is="+i);
            else
                System.out.println("This Number is odd and number is="+i);
        }

        //----------------------------------------------------------------------------------------------------------//

        // 6-# 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.

        for (int i = 0; i <= 100; i++) {

            if (i % 5 == 0 && i % 4 == 0)
                System.out.println("i = " + i);
        }

        //----------------------------------------------------------------------------------------------------------//

        // 9-Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

        //----------------------------------------------------------------------------------------------------------//



    }
}
