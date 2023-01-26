package Gun21;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array: boyut sayısı belli, sonradan değiştirilimez
        int[] dizi=new int[5]; // Array 5 elemanlı boyutu sonradan değiştirilemiyor

        // boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList: boyutunu başta vermene bile gerek yok, boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Emre"); // uzunluk 1
        isimler.add("Gürkan"); // uzunluk 2
        isimler.add("Samed"); // uzunluk 3
        isimler.add("Ceykıp"); // uzunluk 4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.SIZE() = " + isimler.size());

        isimler.add(1,"Cihan"); // verilen indexe ekliyor, diğerleri 1 kayıyor sona doğru
        System.out.println("isimlerADD = " + isimler);

        isimler.set(2,"Mehmet"); //verilen indexin elemanını değiştirir
        System.out.println("isimlerSET = " + isimler);

        boolean varMi=isimler.contains("Emre"); // var mi
        System.out.println("varMi = " + varMi); // true


        isimler.remove("Ceykıp"); // değere göre siler
        System.out.println("isimler(REMOVE) = " + isimler);

        isimler.remove(1); // rakam verildiğinde index kabul ediyor ve ona göre siliyor
        System.out.println("isimler(REMOVE(1) = " + isimler);

        int indexofSamed=isimler.indexOf("Samed");
        System.out.println("indexofSamed = " + indexofSamed);

        String ilkEleman=isimler.get(0); // verilen indexdeki değeri verir.
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); //her şeyi temizliyor
        System.out.println("isimlerCLEAR = " + isimler);
    }
}
