package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {

        // is string: bir stringin içinde bir şey var mı yok mu boolean olarak verir.

        String s1="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty());

        String s2=" ";      //boşluk olsa dahi karakter vardır. sonuç true gelir.
        System.out.println("s2.isEmpty() = " + s2.isEmpty());

        String s3="";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());






    }
}
