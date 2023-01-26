package Gun39._05_OOP_Soru;

import Gun39.Utility.MyFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        List<IFood> siparisler=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int secim=0;
        do {

            menu();
            secim=sc.nextInt();

            switch (secim){
                case 1:IFood ak=new AdanaKebap();
                siparisler.add(ak);
                break;
                case 2:IFood l=new Lahmacun();
                    siparisler.add(l);
                    break;
                case 3:IFood b=new Borsh();
                    siparisler.add(b);
                    break;
                case 4:IFood p=new Palov();
                    siparisler.add(p);
                    break;
            }

        }while (secim<5 );

        System.out.println("Alınan Siparişler");
        for (IFood f : siparisler){
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("\nSiparişleriniz hazırlanıyor...");

        MyFunction.Bekle(2);
        double toplam=0;
        for (IFood f : siparisler){
            TechnoKitchen.hazirla(f);
            toplam+= f.ucret();
            MyFunction.Bekle(2);

        }
    }
    public static void menu(){
        System.out.println("\n****Menü****" +
                "\n1-Adana Kebap (75 TL)" +
                "\n2-Lahmacun (55 TL)" +
                "\n3-Palov (40 TL)" +
                "\n4-Borsh (60 TL)" +
                "\n5-Tamam" +
                "\nSeçiminiz=");
    }
}
