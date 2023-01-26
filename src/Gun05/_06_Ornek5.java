package Gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        // bir karenin kenarını kullanıcıdan isteyip çceresini ve alanını yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("kenar=");
        int kenar=oku.nextInt();


        int cevre=4*kenar;
        System.out.println("cevre = " + cevre);
        
        int alan=kenar*kenar;
        System.out.println("alan = " + alan);




    }
}
