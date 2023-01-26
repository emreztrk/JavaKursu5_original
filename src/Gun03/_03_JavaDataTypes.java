package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // hafızada int kadar yer ayırıyor, sadece tam sayı atılabiliyor
        // tam sayılarda default "int"dir.

        // tam sayılar
        byte byteDeger = 7; //-128 .... 127
        short shortDeger = 1645; // -32000.....32000
        int intDeger = 250000;
        long longDeger = 232323236546546546L;   // L harfi long için.

        //  ondalıklı sayılar
        // ondalıklı sayılarda default "double"dır.

        double doubleDeger = 3.141414141;   //noktadan sonra 16 hane duyarlıdır
        float floatDeger = 3.141414F;           //noktadan sonra 7 hane duyarlıdır. F harfı float için.

        // karakter ve Karakterler
        char basHarf = 'A';   //charda tek tırnak, bir tane karakter saklayabilir
        String isim = "Emre";  //stringde çift tırnak, kelime veya cümle saklayabilir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);


    }
}
