package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("karabaş");
        kopek1.ses();
        kopek1.kokladi();

        Kedi kedi1=new Kedi("köpük");
        kedi1.ses();
        kedi1.tirmaladi();

        kopekSesi(kopek1);
        kediSesi(kedi1);

        hayvanSesi(kopek1); // köpek sesini metoda gönderdi
        hayvanSesi(kedi1);  // kedi sesini metoda gönderdi
        System.out.println("**************************************************");

        //Referans tipi ///nesne tipi
        Hayvan hayvan1=new Hayvan("ördek"); // hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("kangal");// hayvanlardan 1 köpek
        Hayvan hayvan3=new Kedi("boncuk");// hayvanlardan 1 kedi

        System.out.println("-----------------------------");
        hayvan1.ses(); // ses çıkardı yazar. genel hayvan
        hayvan2.ses();// köpek hayvan oldugu için havladı çıkar
        hayvan3.ses();// kedi hayvan oldugun için miyavladı çıkar
        System.out.println("-----------------------------");

        hayvan2.ses(); // kopek de olsa hayvan referansı sebeiyle metodları kısıtlı
        // peki bu hayvanı köpek formunu nasıl ortaya çıkartırım
        // tip döünüşü burada işe yarayabilir
        ((Kopek)hayvan2).kokladi(); // artık diğer metodları kullanabilirim.
        // (int)Math.random() casting gibi, tip dönüşümü

        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.

    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }

    public static void hayvanSesi(Hayvan hayvan){
        //buraya hem kedi geliyor hem kopek geliyor
        hayvan.ses();

        // bir classın aslında kim oldugunu bulma yöntemi
        if (hayvan instanceof Kopek) //hayvan aslında kopek mi?
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof Kedi) // hayvan aslında kedi mi?
            ((Kedi)hayvan).tirmaladi();
    }
}
