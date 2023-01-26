package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {

        /// girilen sayının tek mi çift mi old.. yaz

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi= oku.nextInt();

        String sonuc= ((sayi % 2) == 0) ? "çift" : "tek"; // ? -> if demektir : -> else demektir.
        System.out.println("sonuc = " + sonuc);

        System.out.println( ((sayi%2 ==0 ? "çift":"tek")));




    }
}
