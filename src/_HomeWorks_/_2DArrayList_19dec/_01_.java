package _HomeWorks_._2DArrayList_19dec;

import java.util.Collections;
import java.util.HashSet;

public class _01_ {
    public static void main(String[] args) {

        //totalCount() isminde bir method oluşturun.
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın.
        //totalCount'u döndürün.
        // _**Örnek:**_
        //hashset ; 4,2,3,1,7
        //cevap: 5

        HashSet<Integer> sayi=new HashSet<>();
        Collections.addAll(sayi,4,2,3,1,7);

        System.out.println("Çıktı: "+totalCount(sayi));
    }
    public static int totalCount(HashSet<Integer> number){
        return number.size();
    }
}
