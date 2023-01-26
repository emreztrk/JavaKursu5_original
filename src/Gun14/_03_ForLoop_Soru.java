package Gun14;

public class _03_ForLoop_Soru {
    public static void main(String[] args) {
        //0 dan 10(dahil) kadar sayıları ekrana yazdırnız
        //10 dan 0(dahil) kadar sayıları ekrana yazdırnız. (ayrı bir diğer for)

        for (int i=0; i<=10; i++) {
            System.out.println("i=" + i);
        }
        System.out.println();   // satır arası boşluk açmak için boş sout yazzdık.

        for (int i=10; i>=0; i--)
            System.out.println("i="+i);
    }
}
