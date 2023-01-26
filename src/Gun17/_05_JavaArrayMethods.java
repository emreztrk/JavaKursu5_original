package Gun17;

import java.util.Arrays;

public class _05_JavaArrayMethods {
    public static void main(String[] args) {

        String[] isimler= {"ahmet","zeynep","roman","yasin","cihan"};

        // diziyi string olarak direk yazdırır.
        System.out.println("isimler = " + Arrays.toString(isimler));

        //dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

        // Diziler eşit mi?
        int [] a={1,8,3,54};
        int [] b={1,8,3,54};
        int [] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));

        Arrays.sort(c); // sayı bazlı dizi sıralaması
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        // contains gibi çalışır, var ise pozitif bir değer döndürür, yok ise negatif
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b, 3));
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b, 3));
    }
}
