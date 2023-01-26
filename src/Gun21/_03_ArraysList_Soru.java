package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArraysList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner sc=new Scanner(System.in);
        Scanner scSTR=new Scanner(System.in);
        ArrayList<Integer> notlar=new ArrayList<>();

        int toplam=0;
        String devamMi;
        do {
            System.out.print("Not Giriniz=");
            int not= sc.nextInt();
            notlar.add(not);
            toplam=toplam+not;
            System.out.println("Devam mi? Evet/Hayır=");
            devamMi=scSTR.next();

        }while (devamMi.equalsIgnoreCase("E"));

        int ort=toplam/notlar.size();
        System.out.println("ort = " + ort);

        int gecenSayisi=0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>ort)
                gecenSayisi++;

        }
        System.out.println("gecenSayisi = " + gecenSayisi);
    }
}
