package Gun17;

import java.util.Scanner;

public class _04_JavaSplitMethod {
    public static void main(String[] args) {
        // Split: stringi parçalara ayırmak demek.

        // kullanıcıdan alacagınız cumleyi kelimelerine göre alt alta yazdırınız.

        Scanner sc=new Scanner(System.in);
        System.out.print("cümle=");
        String cumle= sc.nextLine();

        String [] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);


        }
    }
}
