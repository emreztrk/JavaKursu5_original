package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; // tek bir rakam tutabilen bir değişken
        int[] dizi=new int[20]; // 20 adet sayı saklayabilen bir değişken, uzunluğu sabit
        int[][] tablo=new int[20][2]; //20*2 lik sayı saklayabilen değişken, sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>(); // istednildiği kadar sayı eklenebilen, uzunluğu değişken

        // buraya kadar bunları öğrendik

        // bir sınıfda 20 kişi var ve bunların 3 dersi olsun. Öğrencilerin bu derse ait notlarını
        //nasıl bir değişkende sakyalabilirim.

        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //ArrayList in içine ArrayList i nasıl yaparım.
        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>(Arrays.asList(matNotlari,fizNotlari,kimNotlari));  // listlerin listesi
        System.out.println("notlarListesi(asList) = " + notlarListesi); // array.aslist yöntemi de çalışır burada.

        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

       //  Collections.addAll(notlarListesi,matNotlari,kimNotlari,fizNotlari);

        System.out.println("notlarListesi = " + notlarListesi); //bu satır çalıştığı zaman listeyi iki kez yazar.
        //çünkü array.aslist ile zaten içine eklemiştin. iki kez eklemiş oldun.

        notlarListesi.get(0); // mat notlarını getirir.
        int matBirNot=notlarListesi.get(0).get(0); // mat notlarının ilkini getirir.
        System.out.println("matBirNot = " + matBirNot);

        // yukarıdakinin yerine bir for döngüsü nasıl kullanırız
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi.get(i) = " + notlarListesi.get(i));
        }
        /********************* satır sutun yazdırma **************************************/
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) { //notlar[i]length
                System.out.println("notlarListesi = " + notlarListesi.get(i).get(j)+"\t"); //notlar[i][j]
            }
            System.out.println();

        }


    }
}
