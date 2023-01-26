package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // kullanıcıdan 5 sayı isteyiniz.
        // bu sayılarda 6 ile 10 araasındakiler hariç, diğerlerini toplasın.

        // NOT: break ve continue döngüleri etkiler. İf şartı ile çalışır.

        Scanner sc=new Scanner(System.in);

        int toplam=0;
        for (int i=0; i<5; i++){
            System.out.print("Bir Sayı Giriniz=");
            int sayi= sc.nextInt();

            if (sayi>=6 && sayi<=10)
                continue;

            toplam=toplam+sayi;
            System.out.println("toplam = " + toplam);
        }
    }
}
