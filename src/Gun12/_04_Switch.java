package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {

        // girilen bir gün numarasına karşılık gelen gün adını yaz

        Scanner sc=new Scanner(System.in);
        System.out.print("Gün No=");
        int gunNo= sc.nextInt();

        /*if (gunNo==1)     normalde yapacğımız uzun sürerdi.
            System.out.println("Pazartesi");
        else
            if (gunNo==2)
                System.out.println("Salı");
        ..........*/

        switch (gunNo){
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Salı"); break;
            case 3: System.out.println("Çarşamba"); break;
            case 4: System.out.println("Perşembe"); break;
            case 5: System.out.println("Cuma"); break;
            case 6: System.out.println("Cumartesi"); break;
            case 7: System.out.println("Pazar"); break;
            default: System.out.println("Hatalı numara"); // case dekilerin dışında ise
        }





    }
}
