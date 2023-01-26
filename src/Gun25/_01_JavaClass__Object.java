package Gun25;


// class tiplerin tanımlandıgı yer
public class _01_JavaClass__Object {

    // metodların yazıldıgı yer
    public static void main(String[] args) { //başla
        // ana programın başladıgı ve çalıştıgı yer
        
        Araba benimArabam= new Araba(); // Araba tür, tip adı, benimArabam nesne
        benimArabam.marka="Bmw";
        benimArabam.renk="Mavi";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2000;

        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);

    }   // dur

    //metodların yazıldıgı yer
}

// class-tiplerin tanımlandıgı yer

class Araba{
    String renk;
    int yili;
    String marka;
    int motorHacmi;
}
