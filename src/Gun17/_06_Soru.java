package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random olarak doldurktan sonra, kullanıcın gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırınız.

        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak sayı(0-10)=");
        int arananRakam= oku.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]==arananRakam)
                System.out.println(i + ".indexde bulunuyor");





        }
    }
}
