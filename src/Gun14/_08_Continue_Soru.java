package Gun14;

import java.util.Scanner;

public class _08_Continue_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekran alt alta olacak şekilde yaz, boşlukları yazmaısn.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sentence=");
        String stc= sc.nextLine();

        for (int i=0; i<stc.length(); i++)
        {
            if (stc.charAt(i)==' ')
                continue;   // sonraki akarakter boşluk ise, onu pas geç

            System.out.println(stc.charAt(i));

        }
    }
}
