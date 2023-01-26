package Gun19;

import java.util.Arrays;

public class _08_JavaMethod_Soru {
    public static void main(String[] args) {
        // main de 20 elemanlı bir dizinin elemanlarını 100 kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.

        int[] dizi=new int[20];

        diziDoldurYazdir(dizi);

    }
    public static void diziDoldurYazdir(int[] sayilar){


        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int)(Math.random()*100);

        }
        System.out.println("Sayılar="+ Arrays.toString(sayilar));
    }
}
