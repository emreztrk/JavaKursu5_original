package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {

        System.out.println("program çalışmaya başladı");
        String kelime="";
        char hard=kelime.charAt(3);

        // program çalışmaya başladı
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 3
        //	at java.lang.String.charAt(String.java:658)
        //	at Gun43._01_JavaException.main(_01_JavaException.java:8)

        //	ALINAN HATA, önce program çalıştı ama çalışma sırasında hata verdi. Program çalışma zamanı içerisindeki
        // hatalara çalışma zamanı yani RUNTIME ERROR, Exception denir.

        System.out.println("program bitti");
    }
}
// daha çalışmadan önce oluşmuş eksikliklerden kayanklı hatalara
// derleme zamanı yani Compile error, Exception diyoruz.
