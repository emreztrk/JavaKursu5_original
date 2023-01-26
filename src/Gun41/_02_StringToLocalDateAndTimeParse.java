package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {

        // kullanıcıdan alınan ve String durumundaki time veya tarih
        // bilgisinin time veya tarih bilgisine çevrilmesş

        long startTime= System.currentTimeMillis(); // kodun performansı

        Scanner sc=new Scanner(System.in);
        System.out.println("Tarih Giriniz (25 01 2023)= ");
        String strTarih=sc.nextLine();

        // kullanıcının gireceği formata gore format oluşturduk
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");

        // Stringin formatı bu formata uygun olmalı. Parse ile çevirdik
        LocalDate tarih=LocalDate.parse(strTarih,f);
        System.out.println("tarih = " + tarih.format(f));

        long finishTime=System.currentTimeMillis();
        System.out.println("gecenSure = " + (finishTime-startTime)+" ms");
    }
}
