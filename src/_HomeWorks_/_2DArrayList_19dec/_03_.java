package _HomeWorks_._2DArrayList_19dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _03_ {
    public static void main(String[] args) {
        // 3-commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        //return tipi arraylist olmalı.
        //**ÖRNEĞİN:**
        //İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
        //İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
        //Ortak değerleri ArrayListe ekleyiniz.
        //çıktı:  "Germany" , "Brazil" ,"USA"
        //ArrayListi yazdırınız.

        HashSet<String> one=new HashSet<>();
        Collections.addAll(one,"Germany","England","South Africa","Brazil","USA");
        HashSet<String> two=new HashSet<>();
        Collections.addAll(two,"Germany","China","Brazil","France","USA");
        ArrayList<String> countries=new ArrayList<>();
        countries.addAll(one);
        countries.addAll(two);
        System.out.println("countries = " + countries);
        System.out.println(commonValues(one,two));

    }
    public static ArrayList<String> commonValues(HashSet<String> first, HashSet<String> second)
    {
        ArrayList<String> common=new ArrayList<>();
        for (String ilk : first ){
            if (second.contains(ilk))
                common.add(ilk);
        }

        return common;
    }

}
