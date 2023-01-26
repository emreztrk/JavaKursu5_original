package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.print("yeni şifreniz = ");
        String newPassword= sc.nextLine();

        if (newPassword.length()<8)
        {
            System.out.println("Lütfen Dikkat !");
            System.out.println("şifre en az 8 karakterden olusmalı");
            // log tutma
        }
        if (newPassword.length()>15)
        {
            System.out.println("Lütfen Dikkat !");
            System.out.println("şifre en fazla 15 karakterden olusmalı");
            // log tutma
        }





    }
}
