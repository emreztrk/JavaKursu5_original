package Gun12;

import java.util.Scanner;

public class _03_IfElse_Soru {
    public static void main(String[] args) {

        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner sc=new Scanner(System.in);

        System.out.print("Ders ve Not Giriniz=");
        String dersNot= sc.nextLine();

        int ind=dersNot.indexOf(":");
        int ogrNot=Integer.parseInt(dersNot.substring(ind+1));

        //int ogrNot=Integer.parseInt (dersNot.replaceAll("[^0-9]","")); //0-9 dışındakileri sil

        if (ogrNot>=90)
            System.out.println("A");
        else
            if (ogrNot>=80)
                System.out.println("B");
            else
                if (ogrNot>=70)
                    System.out.println("C");
                else
                    if (ogrNot>=60)
                        System.out.println("D");
                    else
                        if (ogrNot>=40)
                            System.out.println("E");
                        else
                            if (ogrNot<40)
                                System.out.println("F");











    }
}
