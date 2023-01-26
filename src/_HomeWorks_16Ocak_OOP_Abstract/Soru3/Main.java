package _HomeWorks_16Ocak_OOP_Abstract.Soru3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Storage Capacity = ");
        String str1=sc.nextLine();
        System.out.print("Enter Screen Size = ");
        String str2=sc.nextLine();

        Apple a=new Apple();
        a.options(str1,str2);

        System.out.print("Enter Storage Capacity = ");
        String str3=sc.nextLine();
        System.out.print("Enter Screen Size = ");
        String str4=sc.nextLine();

        Samsung s=new Samsung();
        s.options(str3,str4);


        ArrayList<Phone> appleCart=new ArrayList<>();
        appleCart.add(a);
        appleCart.add(s);

        int toplam=0;

        for (Phone p : appleCart){
           if (p instanceof Apple){
               toplam=p.getSum(Phone.cart);

           }
           else
               if (p instanceof Samsung){
                   toplam=p.getSum(Phone.cart);
               }
        }
        System.out.println("toplam = " + (toplam));



















    }
}
