package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı sayıyı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(ArrayList) atayarak
        // yazdırınız.

        Scanner sc=new Scanner(System.in);
        int[] dizi=new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı Giriniz=");
            dizi[i] = sc.nextInt();
        }

            System.out.println("dizi="+ Arrays.toString(dizi));

            ArrayList<Integer> tekler=new ArrayList<>();

            for (int i = 0; i < dizi.length; i++) {
                if (dizi[i]%2!=0)
                    tekler.add(dizi[i]);

            }
            System.out.println("tekler = " + tekler);

        }




    }

