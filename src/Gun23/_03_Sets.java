package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("Red");

        System.out.println("renkler = " + renkler); // 2. Red i yazdırmadı

        //Ekrana tek tek nasıl yazdırırım.
        for (String eleman : renkler) { //sıra garanti değil
            System.out.println("eleman = " + eleman);
        }
        // int[] dizi={5,6,7,8,9};
        //for (int sayi:dizi) {
        //    System.out.println("sayi = " + sayi); foreach ile ilgili örnek olsun diye eklendi

        // set in kendi sırası nasıl ise onun aynısını verir.
        Iterator gosterge = renkler.iterator();
        while (gosterge.hasNext()) // sıradaki eleman var ise
        {
            System.out.println("gosterdiği eleman = " + gosterge.hasNext());
            // .Next göstergenin gösterdiği elemanı temsil ediyor.
        }
    }
}
