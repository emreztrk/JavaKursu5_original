package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList_Collection {
    public static void main(String[] args) {
        //ArrayListt Collection grubunun bir elemanı
        //Array i sıralarken Arrays.sort u kullandıgımız gibi,
        //ArrayList Collection metodlarını kullanıcaz.

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);       // alt tuşuna basılı tutarken dikey şekilde copy paste yapabilirsin.
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        //Sıralama İşlemi
        Collections.sort(sayilar);
        System.out.println("sayilarSORT = " + sayilar);

        //Tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilarREVERSE = " + sayilar);

        //Max min eleman bulma
        System.out.println("Max= "+Collections.max(sayilar));
        System.out.println("Min= "+Collections.min(sayilar));

        //Bütün elemanları set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilarFILL = " + sayilar);

        //Replace
        Collections.replaceAll(sayilar,0,5);
        System.out.println("sayilarREPLACE = " + sayilar);

        //Tanımlarken değer atama
        // --int[] dizi={2,3,4,5};-- // normalde değerleri böyle atıyorduk
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,6));   // tanımlama anında atama yaptık.
        ArrayList<String> strListe=new ArrayList<>(Arrays.asList("ahmet","mehmet","büşra","emre"));
        System.out.println("liste = " + liste);
        Collections.sort(strListe);
        System.out.println("strListe = " + strListe);


        //2 Adımlı değer atama
        ArrayList<Integer> liste2=new ArrayList<>();
        Collections.addAll(liste2, 2,34,37,45,49);
        System.out.println("liste2 = " + liste2);


        //diziyi direk ArrayList e nasıl atarım.
        Integer[] dizi2={7,8,9,10,11};
        ArrayList<Integer> liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);

    }
}
