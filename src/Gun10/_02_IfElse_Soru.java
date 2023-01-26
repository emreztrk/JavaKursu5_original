package Gun10;

import java.util.Scanner;

public class _02_IfElse_Soru {
    public static void main(String[] args) {

        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.print("Vize Notu=");
        int vize= read.nextInt();

        System.out.print("Final Notu=");
        int Final= read.nextInt();

        double ort=(vize+Final)/2.0;    // 2.0 yazarak bir değeri double yaptık, yeterli oluyor

        if (ort>=60)
            System.out.println("tebrikler geçtiniz");
        else
            System.out.println("kaldınız");

        // sadece 1 satır çalışacak ise noktalı virgül ve süslü parantez zorunlu değil






    }
}
