package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenilen noktadaki karakteri verir
        // karakterlerin sırası 0 dan başlar var ve buna index denir.

        //            0123456789 10 11 12
        String cumle="Merhaba Dünya";   // length 13 ama karakterlerin  oda numarası 0-12 dahil

        char ilkHarf= cumle.charAt(0);  //0 index deki karakteri verir
        System.out.println("ilkHarf = " + ilkHarf);




    }
}
