package Gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        //bir diktörgenin gerekli kenar uzuzluklarını kullanıcıdan isteyip çevre ve alanını yazdırnız.

        Scanner oku= new Scanner(System.in);

        System.out.print("kisaKenar=");
        int kisaKenar=oku.nextInt();

        System.out.print("uzunKenar=");
        int uzunKenar=oku.nextInt();

        int cevre= 2*kisaKenar+2*uzunKenar;
        int alan= kisaKenar*uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);





    }
}
