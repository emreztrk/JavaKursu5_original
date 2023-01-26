package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {

        // Stringlerde neden == yerine equal kullanılıyor?


        //İlkel tipleri karşılaştırdıgından 2 sinde de değeleri karşılaştırır
        // çünkü başka bir şey yok.
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        if (cumle1== cumle2)
            System.out.println("cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit DEĞİL");

        if (cumle1.equals(cumle2))
            System.out.println("cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit DEĞİL");

        //********** Referans tiplerde ise durum **********
        //scanner le ekrand okudugunda aşagıdaki gibi oluyor
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if (cumle3== cumle4)    //adresleri karşılaşırır.
            System.out.println("cümle 3 cümle 4 ye eşit");
        else
            System.out.println("cümle 3 cümle 4 ye eşit DEĞİL");

        if (cumle3.equals(cumle4))  //değeleri aynı mı
            System.out.println("cümle 3 cümle 4 ye eşit");
        else
            System.out.println("cümle 3 cümle 4 ye eşit DEĞİL");

    }

}
