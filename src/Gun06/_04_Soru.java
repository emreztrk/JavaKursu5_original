package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen bir string in son harfini yazdırnız.

        Scanner okuStr=new Scanner(System.in);

        System.out.print("Bir Cümle Giriniz=");
        String cumle= okuStr.nextLine();

        int uzunluk=cumle.length();     //son harfin oda numara uzunluğun bir eksiği (-1)
        char sonHarf=cumle.charAt(uzunluk-1);

        System.out.println("son = " + sonHarf);

        // 2. yöntem
        System.out.println("sonHarf2 = " +cumle.charAt(cumle.length() -1));


    }
}
