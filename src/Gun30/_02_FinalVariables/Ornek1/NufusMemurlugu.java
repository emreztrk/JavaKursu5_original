package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {

        Vatandas v1=new Vatandas("ismet");
        Vatandas v2=new Vatandas("nazmiye");
        Vatandas v3=new Vatandas("nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=456; bu code çalışmıyor çünkü final değişkenin değerini değiştiremezsin
        //final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlanırken, ya da Constructor da

        //final: değer atandıktan sonra değiştirmeyi engelliyor
        //final double pi =3.14;
        //pi=5; --> yapsan engellenirsin.


        //static sayac ise: her yeni nesne olusturuldugunda yeni
        //artan değer almasını sağlıyor
    }
}
