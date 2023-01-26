package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {

        //replace gibi çalışır farkı, KRiter(regex) verilebiliyor.
        // regex: regular expression / düzenli ifadeler

        // TODO : ödev : regex olarak neler yazılabiliyor google dan araştırılacak

        String text="Merhaba Dünya123";

        System.out.println("abn-> _ = " + text.replaceAll("[abn]","_"));

        System.out.println("[A-Z]-> _ = " + text.replaceAll("[A-Z]","_"));

        System.out.println("[0-9]-> _ = " + text.replaceAll("[0-9]","_"));

        System.out.println("text.replaceAll(\"[0-9]\",\"_\") = " + text.replaceAll("[^0-9]","_"));






    }
}
