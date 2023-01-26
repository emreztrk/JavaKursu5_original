package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

        //girilen bir cümlede a harfinin geçip geçmediğini bulun. ,geçiyor ise evet geçmiyor ise hayır yazdır.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle= oku.nextLine();

        if (cumle.contains("a"))
            System.out.println("a var mı? = EVET");

        if (!cumle.contains("a"))   //ünlem işareti değilse demek //if (cumle.consatins ("a)==false)
            System.out.println("a var mı? = HAYIR");

        //2. yol

        if (cumle.indexOf("a") != -1)
        System.out.println("EVET");

        if (cumle.indexOf("a") == -1)
        System.out.println("HAYIR");

        //3. yol
        boolean varMi=cumle.contains("a");
        if (varMi ==true)
            System.out.println("evet");

        if (varMi ==false)
            System.out.println("hayır");






    }
    }

