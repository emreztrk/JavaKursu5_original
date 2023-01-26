package _Mentoring_Class;

public class _03_Week4_Array {
    public static void main(String[] args) {

        // verilen bir dizinin tekrar eden elemanlarını yazdırın.

        int[] dizi={3,5,6,7,3,5};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[i]==dizi[j]){
                    System.out.println("tekrar eden="+dizi[i]);
                }

            }

        }
    }
}
