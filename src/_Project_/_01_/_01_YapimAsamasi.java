package _Project_._01_;

import java.util.Scanner;

public class _01_YapimAsamasi {
    public static void main(String[] args) {
        Scanner scSTR = new Scanner(System.in);
        Scanner user=new Scanner(System.in);
        Scanner pass=new Scanner(System.in);

        System.out.print("Lütfen isminizi girin=");
        String name=scSTR.nextLine();
        String s1=name.substring(0,1).toUpperCase();
        String capFirst=s1+name.substring(1);
        System.out.println(capFirst+" hoşgeldin, soyadını girer misin?");

        String lastName=scSTR.nextLine();
        String s2=lastName.substring(0,1).toUpperCase();
        String capSecond=s2+lastName.substring(1);
        System.out.println(capFirst+" "+capSecond+" isminiz doğru ise devam etmek için 'Y' tuşuna basınız...");

        String okunan = "";
        do {
            okunan= scSTR.next();
            if (!okunan.equalsIgnoreCase("y")){
                System.out.println("Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin...");
                System.out.println(capFirst+" "+capSecond+" isminiz doğru ise devam etmek için 'Y' tuşuna basınız...");
            }

        }while (!okunan.equalsIgnoreCase("y"));
        System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");


        System.out.print(" Lutfen kullanici adnizi belirleyin...:");
        String username = user.nextLine();

        String password;
        String password2;
        do {
            System.out.print(" Lutfen sifrenizi belirleyiniz...:");
            password = pass.nextLine();
            System.out.print(" Sifrenizi tekrar giriniz...:");
            password2 = pass.nextLine();

            if (!password.equals(password2))
                System.out.println("Yanlis veya hatali bir sifre girdiniz lutfen tekrar deneyin...");

        } while (!password.equals(password2));
        System.out.println("Tebrikler... " + username + " kullanici adiyla sisteme kayit oldunuz...");
    }
}
