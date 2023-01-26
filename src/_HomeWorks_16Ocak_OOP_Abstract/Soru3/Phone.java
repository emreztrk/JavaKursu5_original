package _HomeWorks_16Ocak_OOP_Abstract.Soru3;

import java.util.ArrayList;

public abstract class Phone {
    public static ArrayList<String > cart=new ArrayList<>();

    abstract public void options(String a, String b);

    public int getSum(ArrayList<String> a){


        int sayi=0;
        for (String b :  a){

            sayi+= Integer.parseInt(b.replaceAll("[^0-9]",""));

        }
        return sayi;
   }


}
