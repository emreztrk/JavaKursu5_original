package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi=5; // tek bir rakam tutabilen bir değişken
        int[] dizi=new int[20]; // 20 adet sayı saklayabilen bir değişken, uzunluğu sabit
        int[][] tablo=new int[20][2]; //20*2 lik sayı saklayabilen değişken, sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>(); // istednildiği kadar sayı eklenebilen, uzunluğu değişken
        ArrayList<ArrayList<Integer>> listelerinListesi=new ArrayList<>(); // 2 boyutlu, 2 boyutu da değişken

        /********************************************************/

        // Java cım, şu ana kadar verdiğin değişken tipleri için teşekkür ederim,
        // fakat bana öyle bir dizi verki, hem ArrayList gibi olsun, hemde TEKRAR değerleri
        // içine almasın, öyle set ver bana, yani dizi tip ver bana.
        // Java mektubumuza cevap verdi :
        // Sevgili Muhammed hiç canını sıkma , bu iş için tasarlanmış SET ler adını verdiğimiz
        // dizilerimiz var dedi.
        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elamanları tutar.
        // LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
        // TreeSet -> sen ekledikçe onları herzaman SIRALI tutar dedi.
        // bunların ortak özelliği Hiç TEKRAR değer bulundurmaz.

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);

        boolean eklendiMi=hs1.add(5); //true
        boolean tekrarEklendiMi= hs1.add(5);    //false
        hs1.add(2);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);
        System.out.println("hs1 = " + hs1);


    }
}
