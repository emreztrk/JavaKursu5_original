package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        // kullanıcıdan adını ve soyadını ayrı ayrı okutarak alıp, birlikte ekrana yazdınrız.

        Scanner oku= new Scanner (System.in);

        System.out.print("adınız=");
        String ad=oku.next();

        System.out.print("soyadınız=");
        String soyad=oku.next();

        System.out.println("adınız ve soyadınız="+ad+" "+soyad);

    }
}
