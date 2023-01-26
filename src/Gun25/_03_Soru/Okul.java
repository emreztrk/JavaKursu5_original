package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner scStr=new Scanner(System.in);
        Scanner scInt=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Ogrenci student=new Ogrenci();

            System.out.print("Okul No=");student.okulNo=scInt.nextInt();
            System.out.print("Tam Adı=");student.tamAdi=scStr.nextLine();
            System.out.print("Notu=");   student.notu=scInt.nextInt();

            snf.add(student);
        }

        bilgileriYazdir(snf);
        ortalamaYaz(snf);
    }
    public static void bilgileriYazdir(ArrayList<Ogrenci> snf){
        for (Ogrenci student: snf){
            System.out.println("student.okulNo = " + student.okulNo);
            System.out.println("student.tamAdi = " + student.tamAdi);
            System.out.println("student.notu = " + student.notu);
        }

    }
    public static void ortalamaYaz(ArrayList<Ogrenci> snf){
        int toplam=0;
        int ortalama=0;
        for (Ogrenci student : snf){
            toplam=toplam+ student.notu;
            ortalama=toplam/ snf.size();
        }
        System.out.println("toplam = " + toplam);
        System.out.println("ortalama = " + ortalama);

    }
}

