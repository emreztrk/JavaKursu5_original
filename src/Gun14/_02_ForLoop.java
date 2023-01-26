package Gun14;

public class _02_ForLoop {
    public static void main(String[] args) {

        // 1 den 5 e kadar olan sayıları yazdır. normalde aşağıdaki gibi yapardık.

        // döngünün kaç kere döneceği belli olmayan durumlarda kullanırız.
        int i=1;
        while (i<=5)
        {
            System.out.println("while_i="+i);
            i++;
        }

        // for döngüsü, başı belli, sonu belli, artışı belli ise for kullanılır.

        for (i=1; i<=5; i++) {
            System.out.println("for_i = " + i);
        }






    }
}
