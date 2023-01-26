package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // 01234 ; harflerin oda numaraları 0 dan başlar -> index denir.

        String cumle="Merhaba Dünya";
        //D nin indexi kaçtır
        //M nin indexi kaçtır
        //0(506)4545454 parantezin oda numarası kaçtır
        // verilen karakter(ler)in string içindeki INDEX ini verir.

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M"));  // 0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a"));  // 4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha"));   // 3
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" "));     // boşluk 7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A"));     // -1 yok
        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a", 5));   //6
        // a yı aramaya 5(dahil) nolu indexten sonra başla





    }
}
