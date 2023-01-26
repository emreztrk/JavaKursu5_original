package _HomeWorks_;

public class _03_Odev3_19Kasim {
    public static void main(String[] args) {

        // -1-
        //**I love java** olan bir String oluşturun. Bu cümlenin toplam karakter sayısını yazdırın.*//*

        String java= "I love java";
        int java_length=java.length();
        System.out.println("Number of characters(java)= " + java_length);

        // -2-
        //**Sprint planning** olan bir String oluşturun. Bu dizenin _toplam karakter sayısını_ yazdırın.*/

        String plan="Sprint planning";
        int plan_length=plan.length();
        System.out.println("Number of characters(plan)= " + plan_length);

        // -3-
        //**apple** olan bir String oluşturun. String'in _içinde_ **app** olup olmadığını **doğrula**.*/

        String fruit="apple";
        boolean word=fruit.contains("app");
        System.out.println("Fruit = " + word);

        // -4-
        /**orange** kelimesinden oluşan bir String oluşturun. String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.*/

        String fruit2="orange";
        boolean equal=fruit2.equals(fruit);
        System.out.println("Orange vs Apple = " + equal);

        // -5-
        /***apple**  olan  bir String oluşturun.String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
         _Büyük harf veya küçük harf önemli değildir._*/

        String fruit3="apple";
        boolean is_it_equal=fruit.equals(fruit3);
        System.out.println("Apple vs Apple= " + is_it_equal);

        // -6-
        /***Florida** kelimesinden bir String oluşturun.
         Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.*/

        String state="Florida";
        char letterO=state.charAt(2);
        System.out.println("letter O = " + letterO);

        // -7-
        /***Thank you** olan bir String oluşturun.
        Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.*/

       String phrase="Thank you";
       char letterY=phrase.charAt(6);
       System.out.println("letterY = " + letterY);

       // -8-
        //**Main method** oluşturun. **Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

        String value="Mouse";
        System.out.println("value.charAt(2) = " + value.charAt(2));

       // -9-
        /*paper** olan bir String oluşturun.String'i _büyük harfe_ çevirin ve yazdırın. örn: apple > APPLE*/

        String text="paper";
        System.out.println("Upper Case Text = " + text.toUpperCase());

        // -10-
        /**OraNge** olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın. örn: APPLE > apple*/

        String fruit4="OraNge";
        System.out.println("Lower Case Fruit4 = " + fruit4.toLowerCase());

        // -11-
        /***New Jersey** olan bir String oluşturun. String'i _büyük harfe_ çevirin ve yazdırın*/

        String usaState="New Jersey";
        System.out.println("USA State = " + usaState.toUpperCase());

        // -12-
        /***New York** olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın.*/

        String usaState1="New York";
        System.out.println("USA State1 = " + usaState1.toLowerCase());

        // -13-
        /***PADDLE** olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın.*/

        String word1="PADDLE";
        System.out.println("Lower Case Word1 = " + word1.toLowerCase());


        
        













    }
}
