package Gun29._02_PrivateErisim;

public class Calisan {
    int id;
    String name;    // bu üçü default değerde
    String surname;

    private String password; //private

    public void sifreAta(String sifre){
        // şifreyi kontrol ederek atayacağım.

        if (sifre.length()<8) {
            System.out.println("zayıf şifre");
        }
        else {
            password=sifre;
            System.out.println("Şifre başarıyla atandı");
        }
    }
    public void sifreGoster(){
        System.out.println("****"+password.substring(4));
    }
}
