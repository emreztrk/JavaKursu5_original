package Gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {

        // ekrana 5 kez merhaba yazdırınız.

        int sayac=0;
        while (sayac<5) // iken yap : şartı yazıyoruz, dönme şartı
        {
            // her döndükçe yapılacaklar. tekrarlanacak adımlar buara yaz
            System.out.println(sayac+".Merhaba");

            sayac++;

        }

        System.out.println("Program Bitti");





    }
}
