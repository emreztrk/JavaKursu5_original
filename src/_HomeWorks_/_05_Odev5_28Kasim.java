package _HomeWorks_;

import java.util.Scanner;

public class _05_Odev5_28Kasim {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

       // 1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz.
        {
            int sayac = 0;
            int tekToplam = 0;

            while (sayac <= 20) {
                System.out.print(sayac + ".Sayı Giriniz=");
                int sayi = oku.nextInt();

                if (sayi % 2 == 1)
                    tekToplam = tekToplam + sayi;

                sayac++;

            }
            System.out.println("tekToplam = " + tekToplam);
        }

        // 2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz
        {
            {
                int sayac=1;
                int kacTek=0;


                while (sayac<=20)
                {
                    System.out.print(sayac+".Sayı Giriniz=");
                    int sayi= oku.nextInt();

                    if (sayi%2==1)
                        kacTek++;

                    sayac++;
                }
                System.out.println("kacTek = " + kacTek);
            }
        }

        //  3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.
        {
            int sayac=1;
            int userInput=0;
            int toplam=0;

            System.out.print("Kullanıcı Sayı=");
            userInput=oku.nextInt();



            while (sayac<=userInput)
            {

                toplam=toplam+sayac;

                sayac++;

            }
            System.out.println("Toplam="+toplam);
        }

        // 4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.
        {
            int sayac=0;
            int toplam=0;


            while (sayac<=20)
            {
                System.out.println(sayac+".Sayı Giriniz=");
                int sayi= oku.nextInt();

                if (sayi>10 && sayi<30)
                    toplam=toplam+sayi;

                sayac++;

            }
            System.out.println("toplam = " + toplam);
        }

        // 5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        {
            int sayac=1;
            int birlerBasToplami=0;

            while (sayac<=100) {
                if (sayac%10== 5) {
                    birlerBasToplami++;
                }

                sayac++;
            }

            System.out.println("birler = " + birlerBasToplami);
        }

        // 6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //
        //    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //
        //   Eğer bilirse tebrikler yazsın.

        {
            int pcSayi=(int)(Math.random()* 10)+10;
            System.out.println("pcSayi = " + pcSayi);


            System.out.print("1.Tahmin=");
            int tahmin1= oku.nextInt();

            if (tahmin1==pcSayi)
                System.out.println("Tebrikler");
            else
                System.out.print("Bilemediniz, 2.Tahmin=");
            int tahmin2= oku.nextInt();
            if (tahmin2==pcSayi)
                System.out.println("Tebrikler");
            else
                System.out.print("Bilemediniz, 3.Tahmin=");
            int tahmin3= oku.nextInt();

            if (tahmin3==pcSayi)
                System.out.println("Tebrikler");
            else
                System.out.println("Bilemediniz"+"."+"Tutulan Sayi="+pcSayi);
        }

        {
            // 7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

            Scanner sc=new Scanner(System.in);

            System.out.print("Sayı Giriniz=");
            int sayi= sc.nextInt();

            int birBas=sayi%10;
            sayi=sayi/10;
            System.out.println("sayi1 = " + sayi);
            int onlarBas=sayi%10;
            sayi=sayi/10;
            System.out.println("sayi2 = " + sayi);
            int yuzlerBas=sayi%10;
            System.out.println("Basamaklar = " + birBas+"."+onlarBas+"."+yuzlerBas);
        }

        // 8- Girilen bir sayının kaç basamak olduğunu bulunuz.
        {
            Scanner sc=new Scanner(System.in);

            int sayac=0;

            System.out.print("Sayı Giriniz=");
            int sayi= sc.nextInt();

            while (sayi>0) {
                sayi = sayi / 10;
                sayac++;
            }
            System.out.println("Basamak Sayısı="+sayac);
        }

        // 9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        {
            Scanner sc = new Scanner(System.in);


            System.out.print("Sayı Giriniz=");
            int sayi = sc.nextInt();

            int birBas = sayi % 10;
            sayi = sayi / 10;

            int onlarBas = sayi % 10;
            sayi = sayi / 10;

            int yuzlerBas = sayi % 10;

            System.out.println("Ters Sayı = " + birBas + onlarBas + yuzlerBas);
        }



    }

}
