package Gun46;

public class S20 {
    public static void main(String[] args) {

        int[][] arr=new int[2][4]; // 2. boyut yani sutun asagıda yeniden boyutlandırılıyor

        arr[0]= new int[]{1, 3, 5, 7};  // satir 0
        arr[1]= new int[]{1, 3};        // satir 1

        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        System.out.println("----------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}
