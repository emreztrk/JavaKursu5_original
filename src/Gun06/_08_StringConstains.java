package Gun06;

public class _08_StringConstains {
    public static void main(String[] args) {

        // contains:  bir stringin içerisinde karakter(lerin) var olup
        //olmadıgını boolean cinsinnden söyle true veya false

        String cumle="Merhaba Dünya";

        boolean varMi=cumle.contains("a");
        System.out.println("varMi = " + varMi);

        //direkt yapım

        System.out.println("varMi = " + cumle.contains("a"));

        System.out.println("cumle.contains(ya) = " + cumle.contains("ya"));
        System.out.println("cumle.contains(k) = " + cumle.contains("k"));


    }
}
