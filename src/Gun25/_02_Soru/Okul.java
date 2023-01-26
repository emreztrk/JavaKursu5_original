package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz.
        Scanner scStr=new Scanner(System.in);
        Scanner scInt=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("Öğrenci Adı=");
            ogr.adi = scStr.nextLine();
            System.out.print("Öğrenci Soyadı=");
            ogr.soyadi = scStr.nextLine();
            System.out.print("Öğrenci Sınıfı=");
            ogr.sinif = scInt.nextInt();
            System.out.print("Öğrenci Adresi=");
            ogr.adres = scStr.nextLine();
            
            snf.add(ogr);
        }
        for (Ogrenci ogr: snf){
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);
        }
    }
}
class Ogrenci{
    // properties, field, özellikleri buraya yazıyoruz.
    String adi;
    String soyadi;
    int sinif;
    String adres;
}
