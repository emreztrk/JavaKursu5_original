package Gun06;

public class _01_StringTrim {
    public static void main(String[] args) {
        // trim: string in başındaki ve sonundaki boşlkları alır.

        String text="    Merhaba Dünya    ";
        System.out.println("text = ->" + text+"<-");
        System.out.println("text = ->" + text.trim()+"<-");
    }
}
