package Gun32._03_Encapsulation;

import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu", 3 );

        do {
            System.out.print("Adınız= ");String ad=scStr.nextLine();
            System.out.print("Soyadınız= ");String soyad=scStr.nextLine();
            System.out.print("Öğreci Yaşı= ");int yas=scInt.nextInt();

            if (yas<15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrenciler().add(ogr);
            }
            else {
                System.out.println("Öğrenci yaşı okul için uygun değil");
            }


        }while (yeniOkul.getOgrenciler().size()< yeniOkul.getKontenjan());

        System.out.println("Ogrenciler= "+yeniOkul.getOgrenciler());

    }
}
