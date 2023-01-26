package _HomeWorks_;

import java.util.Scanner;

public class _04_Odev4_19Kasim {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);

        Scanner read4 = new Scanner(System.in);


        // -1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        {

            System.out.print("Name=");
            String name = oku.nextLine();
            System.out.print("Last Name=");
            String lastName = oku.nextLine();
            System.out.println("name = " + name + " " + lastName);
        }

        /******************************************************************************************************/

        // -2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        {
            System.out.print("Enter Word=");
            String word = oku.next();
            System.out.println("word.isEmpty() = " + word.isEmpty());
        }

        /******************************************************************************************************/

        // -3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)

        {
            System.out.print("Enter Sentence=");
            String stc = read.nextLine();
            int total_length = stc.length();
            System.out.println("total_length = " + total_length);
            int removedA = stc.replace("a", "").length();
            System.out.println("removedA = " + removedA);
            int lengthA = total_length - removedA;
            System.out.println("lengthA = " + lengthA);
        }

        /******************************************************************************************************/

         // -4- girilen bir kelimenin ilk ve son harfini bulunuz.

        {
            System.out.print("Enter Word=");
            String word1 = oku.next();

            int uzunluk = word1.length();
            char firsLetter = word1.charAt(0);
            char lastLetter = word1.charAt(uzunluk - 1);
            System.out.println("First Letter,Last Letter = " + firsLetter + "," + lastLetter);
        }

        /******************************************************************************************************/

         // -5-girilen bir cümledeki ilk kelimeyi yazdırınız

        {
            System.out.print("Enter Sentence=");
            String entWord = read2.nextLine();
            int spaceIndex = entWord.indexOf(" ");
            System.out.println("FirstWord = " + entWord.substring(0, spaceIndex));
        }

        /******************************************************************************************************/

         // -6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

        {
            System.out.print("Enter Sentence=");
            String stc1 = oku.nextLine();

            int spaceIndex1 = stc1.indexOf(" ");
            int spaceIndex2 = stc1.indexOf(" ", spaceIndex1 + 1);

            String firstWord = stc1.substring(0, spaceIndex1);
            String secondWord = stc1.substring((spaceIndex1 + 1), spaceIndex2);

            System.out.println("firstWord & secondWord = " + firstWord + " " + secondWord);
        }

        /******************************************************************************************************/

        // 7-  Girilen bir cümlede kaç kelime olduğunuz bulunuz.

        {
            int spaceCount=0;


            System.out.print("Enter Sentence=");
            String stc = oku.nextLine();

            int space=stc.indexOf(" ");
            spaceCount++;
            int space1=stc.indexOf(" ",space+1);
            spaceCount++;
            int space2=stc.indexOf(" ",space1+1);
            spaceCount++;
            System.out.println("Kelime Sayısı = " + (spaceCount+1));


        }


        /******************************************************************************************************/

        // -8- Girilen bir cumledeki kelimelerin ilk harflerini hazdırınız.

        {
            System.out.print("Enter Sentence=");

            String stc = oku.nextLine();

            int space = stc.indexOf(" ");
            int space2 = stc.indexOf(" ", space + 1);
            int space3 = stc.indexOf(" ", space2 + 1);
            int space4 = stc.indexOf(" ", space3 + 1);
            char first = stc.charAt(0);
            char second = stc.charAt(space + 1);
            char third = stc.charAt(space2 + 1);
            char fourth = stc.charAt(space3 + 1);
            System.out.println("first+second+third+fourth = " + first +"-"+ second+"-" + third+"-" + fourth);
        }


        /******************************************************************************************************/

        // -9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        {
            System.out.print("Full Name=");
            String fullname = read4.nextLine();

            char firstname = fullname.charAt(0);

            int space = fullname.indexOf(" ");
            int space2 = fullname.indexOf(" ", space + 1);
            char secondname = fullname.charAt(space + 1);

            char lastname = fullname.charAt(space2 + 1);
            System.out.println("firstname = " + firstname + "." + secondname + "." + lastname + ".");
        }


    }
}
