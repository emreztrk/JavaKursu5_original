package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        //  \n --> yeni satır açıyor, alt satıra geçiyor
        //  \t --> sanki tab tuşna basılmış gibi boşluk bırakıyor
        //  \b --> back-space bir karakter geri siler
        //  \" --> tırnak yazmak için kullanılıyor. Tırnağı ekrana yazdırmak için girilen komut
        //  \\ --> \ yazdırmak için iki kere ters slash açıyorsun
        //  /r --> satır başına geri ve satırı silip tekrar baştan yazıyormuş gibi yapar

        System.out.println("merhaba\tdünya");
        System.out.println("merhaba\bdünya");
        System.out.println("merhaba\"dünya");
        System.out.println("merhaba\\dünya");
        System.out.println("merhaba\rdünya");




    }
}
