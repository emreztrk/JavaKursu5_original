package Gun15;

public class _02_JavaNestedLoop_Soru {
    public static void main(String[] args) {

        // 2 ler çapım tablosu 5(dahil) lere kadar yapınız.

        for (int j=1; j<=5; j++) {

            for (int i=1; i<=10; i++)
                System.out.println(j+"x"+i+"="+(j*i));

            System.out.println();

        }
    }
}
