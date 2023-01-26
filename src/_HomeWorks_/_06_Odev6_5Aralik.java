package _HomeWorks_;

import java.util.Arrays;
import java.util.List;

public class _06_Odev6_5Aralik {
    public static void main(String[] args) {

        // 1- Bu String'i oluşturun. "Removes white space from both ends of a string."
        // String'deki kelime sayısını yazdırınız.

        String cumle="Removes white space from both ends of a string";

        int spaceCount=0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==' ')

                spaceCount++;
        }
        System.out.println("Wordage = " + (spaceCount+1));

        //--------------------------------------------------------------------------------------------------------//

        // 2- Bir String oluşturun : "Hello World"
        // Stringi tersten yazdırın ve print edin.

        String sentence="Hello World";
        System.out.println("Straight Text="+sentence);

        String reversed="";

        for (int i =sentence.length()-1; i>=0; i--) {
            reversed=reversed+sentence.charAt(i);


        }
        System.out.println("Reversed Text="+reversed);

        //--------------------------------------------------------------------------------------------------------//

        // 3- İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.

        int[] numbers={25,30,30,35,100};

        int toplam=0;

        for (int i = 0; i < numbers.length; i++) {
            toplam=toplam+numbers[i];

        }
        System.out.println("toplam = " + toplam);

        //--------------------------------------------------------------------------------------------------------//

        // 4- int Array oluşturun. elemanları : 13, 15,14,16,16
        // Arrayin elemanlarını yazdırın.

        int[] numbers1={13,15,14,16,16};


        for (int i = 0; i < numbers1.length; i++) {

            System.out.println("i = " + numbers1[i]);
        }

        //--------------------------------------------------------------------------------------------------------//

        // 5- String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        // Array'daki eleman sayısını yazdırınız.

        String[] states={"New Jersey","New York","Boston","California"};

        System.out.println("states = " + states.length);

        //--------------------------------------------------------------------------------------------------------//

        // 6- String Array (Dizi) oluşturunuz. elemanları : Apple, Orange , Babana, Kiwi
        // Array'leri tüm elemanları yazdırınız.

        String[] fruits={"Apple","Orange","Banana","Kiwi"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i+".fruits = " + fruits[i]);
        }

        //--------------------------------------------------------------------------------------------------------//

        // 7-int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int[] digits={12,14,21,23,10,4};

        int toplam1=0;

        for (int i = 0; i < digits.length; i++) {
            toplam1=toplam1+digits[i];
            System.out.println("toplam = " + toplam1);
        }

        int ort=toplam1/ digits.length;
        System.out.println("ort = " + ort);

        //--------------------------------------------------------------------------------------------------------//

        // 9- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] digits1={15,25,22,18,30};

        Arrays.sort(digits1);
        System.out.println("digits = " + Arrays.toString(digits1));

        int enbuyuk=digits1[0];
        int ikinci=digits1[0];

        for (int i = 0; i < digits1.length; i++) {

            if (digits1[i]>enbuyuk)
            {
                ikinci=enbuyuk;
                enbuyuk=digits1[i];
            }
            else if (digits1[i]>ikinci) {
                ikinci=digits1[i];
            }
        }
        System.out.println("ikinci = " + ikinci);

        //--------------------------------------------------------------------------------------------------------//

        // 10-int Array oluşturun ve elemanları : 14 , 19 , 5 , 21//
        //En küçük (minimum) sayıyı yazdırınız.

        int[] numb={14 , 19 , 5 , 21};

        int min=numb[0];

        for (int i = 0; i < numb.length; i++) {

            if (numb[i]<min)
                min=numb[i];

        }
        System.out.println("min = " + min);

        //--------------------------------------------------------------------------------------------------------//

        // 11-int Array oluşturun ve elemanları : 12,2,5,15,8. En büyük değeri yazdırınız.
        int[] numb1={14 , 19 , 5 , 21};


        int max=numb1[0];

        for (int i = 0; i < numb1.length; i++) {

            if (numb1[i]>max)
                max=numb1[i];

        }
        System.out.println("max = " + max);

        //--------------------------------------------------------------------------------------------------------//

        // 12- String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin. Eğer aitse "true" çevirin.

        String[] meyve={"Apple","Orange","Banana","Pineapple"};


        List<String> list=Arrays.asList(meyve);

        if (list.contains("Apple"))
            System.out.println(true);
        else
            System.out.println(false);

        //--------------------------------------------------------------------------------------------------------//

        // 13-Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın. Sayıların toplamını yazdırın.

        String[] dolar={"$12","$23","$10","$2","$5","$2"};

        for (int i = 0; i < dolar.length; i++) {
            if (dolar[i].startsWith("$")) {
                dolar[i] = dolar[i].replaceAll("[$]", "");
            }
            int toplam2=0;
            toplam2= toplam2+Integer.parseInt(dolar[i]);
            System.out.println("toplam = " + toplam2);
        }

    }
}
