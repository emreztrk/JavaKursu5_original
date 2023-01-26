package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {

        // girilen bir sayının negatif mi, pozitif mi olduğunu yazdırnız, sıfır ise 0 yazdırnız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı giriniz=");

        int sayi= oku.nextInt();

        if (sayi >0)
            System.out.println("pozitif");

        if (sayi <0)
            System.out.println("negatif");

        if (sayi == 0)
            System.out.println("sıfır");






    }
}
