package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        // baklava dilimi ->if
        // girilen bir sayının 10 dan büyük ise ekrana "10 dan büyük" yzdırnız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();

        if (sayi > 10)
        { //if sartı saglandıgında yapılacakların parantezi
            System.out.println("10 dan büyük");
            System.out.println("if in içinde birden fazla komut var ise parazantezleri şarttır");
        }





    }
}
