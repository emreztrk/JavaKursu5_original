package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
      // equals: 2 stringin birbirine eşit olup olmaıdgını kontrol eder.
      // sonu boolean

      String s1="Merhaba";
      String s2="MERHABA";

      boolean esitMi=s1.equals(s2); // s1 eşit mi s2 ye     Merhaba ile MERHABA karşılaştırıldı.
        System.out.println("esitMi = " + esitMi);

        System.out.println("ornek1 = " + s1.equals(s2));    // Merhaba ile MERHABA

        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba")); // Merhaba ile Merhaba






    }
}
