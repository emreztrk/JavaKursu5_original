package Gun46;

public class S21 {
    public static void main(String[] args) {

        int[][] arr=new int[2][4];

        arr[0]= new int[]{1, 3, 5, 7};
        arr[1]= new int[]{1, 3};

        // 2 boyutlu dizilerin eleman sayısı diye incelediğimizde satır sayısı karşımıza çıkar
        System.out.println("arr.length = " + arr.length); // satır sayısını verecek
        System.out.println("arr[0].length = " + arr[0].length); //0. satırın eleman sayısı 4
        System.out.println("arr[1].length = " + arr[1].length); //1. satırın eleman sayısı 2

        //arr.length satır sayısnı, a.length ise her satırın elemean sayısını temsil eder.
        for (int[] a : arr) {
            for (int i = 0; i < arr.length; i++) { // arr.length 2 olduğu için döngü ikiden sonra devam etmez.
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
