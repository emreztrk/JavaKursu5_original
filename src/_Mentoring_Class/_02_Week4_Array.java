package _Mentoring_Class;

import java.util.Arrays;

public class _02_Week4_Array {
    public static void main(String[] args) {

        int [] a=new int[3];

        a[0]=3;
        a[1]=5;
        a[2]=7;

        String b= Arrays.toString(a);

        b=b.replace("[","");
        b=b.replace("]","");
        b=b.replace(",","");

        int sayi1=a[0];
        int sayi2=a[1];
        int sayi3=a[2];

        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);

        System.out.println("-------------------------------------------");

        char[] charArray={'m','e','r','h','a','b','a'};


        String c=String.valueOf(charArray);
        System.out.println(c);

    }
}
