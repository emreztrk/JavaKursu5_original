package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program başladı");

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Sayi1= ");
            int sayi1 = sc.nextInt();

            System.out.print("Sayi2= ");
            int sayi2 = sc.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

            String kelime="";
            kelime.charAt(3); // hataya düşsün diye verildi.
        }
        catch (InputMismatchException ex) // belirli bi hata
        { // en genel hata
            System.out.println("Lütfen sayı giriniz.");
        }
        catch (ArithmeticException ex) // belirli bir hata
        {
            System.out.println("Sıfıra bölme hatası");
        }
        catch (Exception ex) // yukardakilerin dışında hatalar için
        {
            System.out.println("hata oluştu "+ex.getMessage());
        }
        System.out.println("program bitti");
    }
}
