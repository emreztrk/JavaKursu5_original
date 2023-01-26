package Gun11;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _04_Ternary_Soru {
    public static void main(String[] args) {

        // girilen sayı 50 den byk ise 1, değilse 0 değerini ternary kullan yaz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number=");
        int nmr = sc.nextInt();

        String conclusion = (nmr > 50) ? "1" : "0";            // tırnaksız da yazılabilirmiş
        System.out.println("conclusion = " + conclusion);

        //2. yöntem
        System.out.println((nmr > 50) ? 1 : 0);


    }
}
