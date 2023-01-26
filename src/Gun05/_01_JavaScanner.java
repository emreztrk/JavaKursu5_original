package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi      adı     ilk değeri      işlem tamam, bu adımı çalıştır
            int     sayi        =0                  ;

            //tipi      adı     yeni okuyucu(klavyeden -konsoldan)
        Scanner         okuyucu =   new Scanner(System.in);

        System.out.print("Sayi giriniz=");
        sayi= okuyucu.nextInt();    //kursor(imleç) bekliyor sayı girişi için.
        //rakam girilip entera basıldıgında degeri alıp sayıya atıyor.

        System.out.println("sayi =" + sayi);







    }
}
