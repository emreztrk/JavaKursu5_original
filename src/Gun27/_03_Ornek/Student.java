package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public static void kuralYazdir(){
        System.out.println("1.Kural = Çaysız ve üzümsüz derse gelme");
        System.out.println("2.Kural = Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("3.Kural = Her zaman dinç, dinamik ve pozitif ol");
        System.out.println("4.Kural = En başta verdiğin sözü unutma, şuan kamptasın");
        System.out.println("5.Kural = İnş, biz bu işi başaracağız");
    }
    public void dersEkle(Lesson ders)
    {
        int suanToplamSaat=0;
        for (Lesson d: dersleri)
            suanToplamSaat+=d.saat;
        if (suanToplamSaat+ders.saat<=maxSaat)
            dersleri.add(ders);
        else
            System.out.println(ders.name+": Kredi Sınırı Aşıldı");
    }
    public void dersleriYazdir(){
        System.out.println("\n**** Transkript ****");
        System.out.println("Sayın "+name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d: dersleri)
            System.out.println(d.name+" "+d.saat);
    }
}
