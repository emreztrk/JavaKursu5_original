package Gun27._01_Ornek;

public class JavaStaticveNonStaticMethodlar {
    public static void main(String[] args) {

        int sayi=345;
        String strSayi=String.valueOf(sayi); // int in içindeki sayıyı string olarak aldık
        int intSayi=Integer.parseInt(strSayi);  // stringi tekrar int e çevirdik

        Utility ut=new Utility();
        String strSayi2= ut.getString(sayi);

        String strSayi3=Utility.getString2(sayi);

        // STATIC olan metdolar SINIF a yani CLASS yani
        // TİP e ait
        // STATIC olmayanlar kime ait, nesneye ait bu sebeple
        // mutlaka oluşturulmaları gerekiyor

        // Nesneyi ilgilendiren metdoları normal yazıyoruz.
        // Nesneyi ilgilendirmeyen, Tipi ilgilendiren
        // metodları STATIC ile yazıyoruz.



    }
}
