package Gun11;

import java.util.Scanner;

public class _05_Ternary_Soru {
    public static void main(String[] args) {
        //girilen sayının sıfır mı, negatif mi, pozitif mi old. ternary operatör ile yaz

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number=");
        int nmr = sc.nextInt();

        String cc= ((nmr==0) ? "sıfır" : ((nmr>0 ? "poz" : "neg")));
        System.out.println("cc = " + cc);
    }
}
