package Gun08;

public class _01_AritmeticOperators {
    public static void main(String[] args) {
        int a=9;
        int b=5;

        System.out.println("Toplama İşlemi=");
        System.out.println("a+b = " + (a+b));

        System.out.println("Çıkarma İşlemi=");
        System.out.println("a-b = " + (a-b));

        System.out.println("Çarpma İşlemi=");
        System.out.println("a*b = " + (a*b));

        System.out.println("Bölme İşlemi=");
        System.out.println("a/b = " + (a/b));
        // bölmede normal sonuc 1.8 , fakat tam sayının tam sayıya bölümünde küsürat atılır.
        // bu sebeple sonuc 1 olur, yuvarlama yapmaz.  çünkü int/int
        // tam sonuç istersen bir tanesini double çevirmen yeterli

        System.out.println("(double)a/b sonucu= "+ ((double)a/b));
        // işlem sonucu normal sonuc 1.8 olur

        System.out.println("Modül İşlemi=");
        System.out.println("a/b = " + (a/b));   // 9/5 -->4
        System.out.println("b/a= "+(b/a));      // 5/9 -->5
        //        kısa önemli not !
        //        Modül (%)'de
        //        sol büyük ise kalanı al       9/5 ->4
        //        sol küçükse solundakini al    5/9 ->5
    }
}
