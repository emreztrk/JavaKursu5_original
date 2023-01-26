package Gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_JavaMap_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String ,String > sozluk=new TreeMap<>();
        Scanner scInt=new Scanner(System.in);
        Scanner scStr=new Scanner(System.in);
        int secim=0;
        do {
            // menü çıkacak
            System.out.print("MENÜ\n1- EKLEME\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\nSeçiminiz=");
            secim=scInt.nextInt();

            //seçime göre işlem yapılcak
            switch (secim)
            {
                case 1: //1 i secti ise ekleme işlemini yap
                    System.out.print("Kelime giriniz=");
                    String kelime=scStr.nextLine();
                    System.out.print("Manasını Giriniz=");
                    String manasi=scStr.nextLine();
                    //buna uygun değişkene ekle
                    sozluk.put(kelime,manasi);
                    break;
                case 2: // 2 yi seçti ise düzeltme işlemini yap
                    System.out.println("DÜZELTME SEÇİLDİ");
                    break;
            }

        }while (secim!=6); //çıkış olmadıgı sürece devam et
    }
}
