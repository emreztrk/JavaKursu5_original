package Gun28._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        Book bk=new Book();
        bk.name="Harry Potter";
        bk.author="JK Rowling";
        bk.publishYear=1997;


        Book bk1=new Book("Yüzüklerin Efendisi",1954,"JRR Tolkien");
        Book bk2=new Book("Üzüm ve Çay",2000,"");

        System.out.println("bk = " + bk);
        System.out.println("bk1 = " + bk1);
        System.out.println("bk2 = " + bk2);

    }
}
