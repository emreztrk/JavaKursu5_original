package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";

        cumle=cumle+"Bugün"; // + işareti stringlerde birleştirme yapar
        cumle=cumle+" hava"; // atama ister
        cumle+=" çok soğuk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat() = " + cumle.concat(" fakat dün sıcaktı"));
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat(" fakat dün sıcaktı"); // concat de birleştirir, atama ister
        System.out.println("cumle = " + cumle);

        /********** String Builder **********/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün"); // append : ekle, atama gerektirmez, ekler
        cumle2.append(" hava");
        cumle2.append(" soğuk");

        System.out.println("cumle2 = " + cumle2);

        /******** +,concat,StringBuilder 3 model in hızı test edilecek ****/

        long starTime=System.currentTimeMillis();

        String test1="";
        for (int i = 0; i < 10000; i++)
            test1=test1+"merhaba";

        System.out.println("+ için süre " + (System.currentTimeMillis()-starTime)+" ms");

        starTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10000; i++)
            test1=test1.concat("merhaba");

        System.out.println("concat için süre " + (System.currentTimeMillis()-starTime)+" ms");

        starTime=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 10000; i++)
            sb.append("merhaba");

        System.out.println("StringBuilder için süre "+ (System.currentTimeMillis()-starTime)+" ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("***************************************\n\n");
        /***** StringBuilderi biraz daha yakından tanıyalım *****/

        StringBuilder s=new StringBuilder();
        s.append("Bugün ");
        s.append("hava ");
        s.append("güzel");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4);    // eklenen her şeyi toString hali var ise çevirerek ekler
        System.out.println("s = " + s);

        s.reverse();    // string i tersine çevirir.
        System.out.println("s = " + s);
        s.reverse();
        System.out.println("s = " + s);

        s.delete(0,5);  // index 0 dahil, 5 hariç olmak üzere siler.
        System.out.println("s = " + s);

        s.deleteCharAt(3);  // sadece belirtilen index deki karakteri siler
        System.out.println("s = " + s);

        s.insert(5, "Bugün"); // 5 nolu index e kelime yi ekle : araya ekleme
        System.out.println("s = " + s);

        s=new StringBuilder("Bugün hava çok soğuk");    // sıfırlandı ve ilk değer atandı
        System.out.println("s = " + s);

        s.replace(3,8,"bu"); // verilen aralığı bu stringle değiştir
        System.out.println("s = " + s);

        String strS=s.toString();

        StringBuffer sBuffer=new StringBuffer();    // tamamen StringBuilder ile aynı
        // tek farkı, paralel çalışan yazılımlarda, StringBuffer kullanılır.






    }
}
