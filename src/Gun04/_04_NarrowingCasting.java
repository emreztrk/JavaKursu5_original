package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        //byte -> short -> int -> long -> float -> double
        double oran = 3.2;
        int sayi = 5;

        // sayi= oran; -> int i double içine atıyorsun, veri kaybı olur. tehlikeli işlem
        //bundan dolayı challanger patladı. değerlere bak, eğer oluşan veri kaybını anladıysan ve
        //kabul ediyorsan, bana bunu bilerek yaptığını göster -> sayi= (int)oran; yapman gerek.

        sayi= (int)oran;
        System.out.println("sayi = " + sayi); // çalıştırdığın zaman 3 geliyor,5 olmalıydı 2si kayboldu.


    }
}
