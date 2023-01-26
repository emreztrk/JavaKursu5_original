package _HomeWorks_._2DArrayList_19dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class _04_ {
    public static void main(String[] args) {
        // 4- removing() isminde bir method oluşturun.
        //Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        //Eğer Stringler LinkedHashset 'in içinde varsa, sil.
        //Return tipi linkedhashset
        //Örneğin,
        //linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        //String 1= Germany
        //String 2 = USA
        // **Germany ve USA 'i sil.**
        //Set'i döndür.

        LinkedHashSet<String> ulke=new LinkedHashSet<>();
        Collections.addAll(ulke,"Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil");
        String a="Germany";
        String b="USA";
        ulke=removing(ulke,a,b);
        System.out.println(ulke);
    }
    public static LinkedHashSet<String> removing(LinkedHashSet<String> f,String a,String b){

        f.remove(a);
        f.remove(b);

        return f;
    }
}

