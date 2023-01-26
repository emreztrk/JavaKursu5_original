package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {

        long starTime=0;
        String str="";

        try {
            starTime=System.currentTimeMillis();
            System.out.println("hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("hatadan sonraki kısım");
            // hata olma olasılıgının oldugu kodlar
        }
        catch (Exception ex)
        {
            System.out.println("catch bloğu çalıştı");
            // hata oldugunda yapılacaklar
        }
        finally {
            // hata olsa da olmasa da çalısacak kısım, bu bölüm yuakrdaki sürecle
            // oldugunu göstermek için finally içinde yazılır.
            long gecenSure=System.currentTimeMillis()-starTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloguyla ilgili son yapılacaklar");
        }

        System.out.println("diğer çalışan kodlar");

        System.out.println("program sonu");
    }
}
