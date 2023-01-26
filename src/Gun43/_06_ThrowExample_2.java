package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.print("yeni şifreniz = ");
        String newPassword= sc.nextLine();

        try {
            if (newPassword.length() < 8) { // bu mesaj ile suni hata oluşur
                throw new Exception("şifre en az 8 karakterden olusmalı");
            }
            if (newPassword.length() > 15) { // bu mesaj ile suni hata oluşur
                throw new Exception("şifre en fazla 15 karakterden olusmalı");
            }
        }
        catch (Exception ex)
        {
            // hatalar bir yere toplanıp, hepsi için yapılması gereken işlemler
            // bir arada burada yapılabilir. mesala log tutma gibi
            System.out.println("Lütfen Dikkat ! ");
            System.out.println(ex.getMessage());
            // log tutma
        }







    }
}
