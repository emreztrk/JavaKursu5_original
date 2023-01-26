package Gun28._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book(){

    }
    public Book(String name, int publishYear, String author){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;

    }
    public Book(String name, int publishYear){
        this(name,0,"");
    }
    public String toString(){
        return name+" "+author+" "+publishYear;

    }
    // sağ tıklayıp generate tuşundan istediğini otomatik olarak oluşturabilirsin.
    // constructor açıp burdaki 3(name, publishYear, author) bunları seçip yazdır
    // toString ile return ettirebilirsin.

}
