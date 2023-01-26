package Gun31._02_Enum;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

  //  enum Role{
    //    ADMIN, MUDUR, SATIS, PERSONEL, TESTER

    //enum Status{
      //  AKTIF, PASIF
    //bunların yerine class açar gibi açtık klasörün içine


    public static void main(String[] args) {

        USER user1=new USER("Emre",Role.ADMIN, Status.AKTIF);
        USER user2=new USER("Mehmet",Role.MUDUR, Status.PASIF);
        USER user3=new USER("Ayşe",Role.SATIS, Status.AKTIF);
        USER user4=new USER("Can",Role.TESTER, Status.AKTIF);

        userSil(user1);
        userSil(user2);
        userSil(user3);

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user3 = " + user3);
        System.out.println("user4 = " + user4);


    }
    public static void userSil(USER user){
        if (user.role==Role.ADMIN)
        {
            System.out.println(user.username +" Admin Silinemez");
        }
    }

}
