package Gun30;

public class GununSorusu {
    int a;
    static int b=0;

    void artir()
    {
        a++;
        b++;
    }

    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;

        // a nın değeri kaç oldu şu anda --> Burada verilecek cevap hangi a yı soruyorsunuz olmalı.
        // burada her nesnenin a sı var ve gs1 in 5, gs2 nin ise 7 değeri var.
        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        
        // b nin değeri kaçtır --> tek bir değeri vardır en son dğer, yani 0 
        System.out.println("GununSorusu.b = " + GununSorusu.b);

        gs1.artir();    // gs1.a -> 6, b -> 1
        gs2.artir();    // gs2.a -> 8, b -> 2
        // a nın ve b nin en son değeri kaçtır
        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("GununSorusu.b = " + GununSorusu.b);
    }
}
