package _HomeWorks_._2DArrayList_19dec;

import java.util.Collections;
import java.util.HashSet;

public class _02_ {
    public static void main(String[] args) {

        //changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String
        //return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //**ÖRNEK:**
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //String 1 = **banana**
        //String 2 = **peach**
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> fruit=new HashSet<>();
        Collections.addAll(fruit,"banana","strawberry","kiwi","pineapple");

        System.out.println("changeSet(fruit) = " + changeSet(fruit));
    }
    public static HashSet<String> changeSet(HashSet<String> change){
        HashSet<String> changedList=new HashSet<>();
        for (String newFruit : change){
            if (newFruit.equals("banana"))
                newFruit="peach";
            changedList.add(newFruit);
        }
        return changedList;
    }
}
