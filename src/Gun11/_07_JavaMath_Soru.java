package Gun11;

import java.util.Scanner;

public class _07_JavaMath_Soru {
    public static void main(String[] args) {

        // math.max yöntemi ile girilen 3 sayıdan byk olanını bulunuz.

        Scanner sc=new Scanner(System.in);
        System.out.print("A Değeri=");
        int a= sc.nextInt();
        System.out.print("B Değeri=");
        int b= sc.nextInt();
        System.out.print("C Değeri=");
        int c= sc.nextInt();

        //1. yöntem
        int enb=Math.max(a,b);
        enb = Math.max(enb,c);
        System.out.println("enb = " + enb);

        //2.yöntem
        int enb2= Math.max(a, Math.max(b,c));
        System.out.println("enb2="+enb2);






    }
}
