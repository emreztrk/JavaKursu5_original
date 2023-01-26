package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // girilen bir cümledeki küçük veya büyük a harfinin olup olmadıgını yazdırım.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle= oku.nextLine();

        // cumle=cumle.toLowerCase(); eklemiş olsaydın hepsi küçük harf olduğu için kodlar ona göre çalışcaktı

        if (cumle.contains("A"))
            System.out.println("yes");

        if (!cumle.contains("A"))
            System.out.println("no");


        boolean varMi=cumle.contains("A");
        if (varMi==true)
            System.out.println("VAR");

        if (varMi==false)
            System.out.println("YOK");


    }
}
