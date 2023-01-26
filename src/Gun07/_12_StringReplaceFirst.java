package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {

        String text="Merhaba Dünya";

        System.out.println("text = " + text);

        System.out.println("text.replace(a,e) = " + text.replaceFirst("a","e"));

        System.out.println("text.replace(ba, de) = " + text.replaceFirst("ba","de"));

        System.out.println("text.replace(Dünya, Java) = " + text.replaceFirst("Dünya","Java"));

        System.out.println("text.replace(a, '') = " + text.replaceFirst("a", " "));   // a lar silindi
    }
}
