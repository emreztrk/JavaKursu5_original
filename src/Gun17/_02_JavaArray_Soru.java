package Gun17;

import java.util.Scanner;

public class _02_JavaArray_Soru {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sentence=");
        String stc= sc.nextLine();

        int spaceCount=0;

        for (int i = 0; i < stc.length(); i++) {

            if (stc.charAt(i)==' ')
                spaceCount++;
        }
        System.out.println("spaceCount = " + (spaceCount+1));



    }
}
