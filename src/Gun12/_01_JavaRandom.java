package Gun12;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {

        // 0-5 arası gibi sayılar ürettik, hep sıfırdan başladı. 4-9 nasıl üretir
        // yöntem: önce aralık kadar normal üret (9-4) yani 0-5 arası
        // üretilmiş olan sayıya min sayıyı ekle, üretilmiş sayı +4
        // (int)(Math.random()*(max-min)+min

        //girilen max ve min aralığında random sayı ürettiriniriz.

        Scanner sc=new Scanner(System.in);
        System.out.print("min=");
        int min= sc.nextInt();

        System.out.print("max=");
        int max= sc.nextInt();

        int rndSayi= (int)(Math.random()*(max-min)+min);
        System.out.println("rndSayi = " + rndSayi);






    }
}
