package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        int ogrNot; // 1 tane saklar

        //50 kişi var
        int ogr1Not;
        //.....
        //.....
        //....
        int ogr50Not;

        // bana bir tanımlamada BIRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var;
        // ÇÖZÜM :
        int   ogrNot20=0;
        int[] notlar  =new int[50]; // 50 tane int saklayabilen notlar isimli değişken

        notlar [0]=75;
        notlar [1]=88;
        //....
        //....
        notlar[49]=95; // en son alınan toplam eleman sayısı -1. lenght -1 dir böylce 0-49 index dir
        // notlar [50] olsaydı challenger patlar.

        System.out.println("notlar = " + notlar[0]);

        System.out.println("notlar.length = " + notlar.length); //50 yani toplam eleman sayısını verir.
        //dizinin eleman sayısını verir.

        //dizi nasıl okutulur.

        Scanner oku=new Scanner(System.in);
        for (int i=0; i<notlar.length;i++){
            System.out.print("Notu Giriniz=");
            notlar[i]= oku.nextInt();
        }
        for (int i=0; i<notlar.length; i++){
            System.out.println("notlar = " + notlar[i]);
        }
    }
}
