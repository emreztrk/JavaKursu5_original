package _Project_._03_;

import java.util.*;

import java.util.Scanner;
    public class proje_3_Main {

  /*
     Bu proje %90 bir onceki projeden alinmistir... Ufak degisiklikler mevcuttur.. ClASS yapisinin sizlere sagladigi kolayligi
     bu proje ile daha iyi anlayacaksiniz... Bu class gerekli kodlamalar yapildiginda video da gorulen sonucun aynisini verecek
     sekilde duzenlenmelidir...
        - not :  Tek degisiklik = Bir onceki proje de her kullanicinin 1 tek hesap numarasi vardi... Burada her musteriye 2 adet
                 hesap tanimlanmasini istiyoruz...
              :  Ayrica musteriye ait hesaplar listelenirken gecen hafta yapilan hatayi giderecek sekilde her kullanicinin kendi banka
              hesaplarinin listelenmesini saglayiniz...
     * Bu Class da KIRMIZI olarak gorulen kodlar sizin tarafinizdan eklenecek kodlar ile calisir hale gelecekler...
     * Sizlerden asagida belirtilen-kullanilmis Class lari ayri ayri olusturmanizi ve asagida tanimli methodlarin icini doldurmanizi bekliyoruz...
     */


        public static void main(String[] args) {

            // Scanner Class tanimlayin...
            Scanner scan = new Scanner(System.in);

            // Banka Islemleri (Actions) Class indan bir liste olusturun...4 adet islem tanimlayin "Para_Yatir", "Para_Cek", "Transfer", "Cikis"...
            Actions actions1 = new Actions("Para Yatır");
            Actions actions2 = new Actions("Para Çek");
            Actions actions3 = new Actions("Transfer");
            Actions actions4 = new Actions("Çıkış");
            List<Actions> actions = new ArrayList<>(Arrays.asList(actions1, actions2, actions3, actions4));


            // Her musteri (Customer) icin 2 adet hesap (Account) tanimlayin.. Hesap sinifi hesap numarasi ve hesaptaki para miktarini icermeli...
            Account ac1 = new Account(1234, 100);
            Account ac2 = new Account(4321, 200);
            Account ac3 = new Account(5678, 1000);
            Account ac4 = new Account(8765, 2000);
            Account ac5 = new Account(9999, 500);
            Account ac6 = new Account(1111, 400);

            // Banka musterilerini Customer sinifindan objeler olusturarak liste olarak tanimlayin...Customer sinifinda bir musteriye ait
            // username, password ve birden fazla hesap (Account) bulunmalidir...Buna gore bu musterileri burada tanimlayin...

            Customer cus1 = new Customer("user1", "password1", Arrays.asList(ac1, ac2));
            Customer cus2 = new Customer("user2", "password2", Arrays.asList(ac3, ac4));
            Customer cus3 = new Customer("user3", "password3", Arrays.asList(ac5, ac6));
            List<Customer> musteriler = new ArrayList<>(Arrays.asList(cus1, cus2, cus3));

            // Asagidaki kodda KIRMIZI olarak gorulen yerler sizin olustiracaginiz siniflar ve yukarida tanimlayacaginiz objeler ile
            // normal olarak calisacaktir...
            Customer aktifKullanici;
            Account secilenHesap;

            while (true) {
                System.out.println("Please enter your username: ");
                String username = scan.nextLine();
                System.out.println("Please enter your password: ");
                String password = scan.nextLine();

                // -> Bu methodu asagida hangi kullanicinin giris yaptigini belirlemek maksadiyla kullanacaksiniz, olusturun...
                aktifKullanici = confirmUsernameAndPassword(musteriler, username, password);

                if (aktifKullanici != null) {
                    System.out.println("Basarili bir sekilde giris yaptiniz");
                    break;
                }
                System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
            }

            // Actions starts here
            while (true) {
                System.out.println("Yapmak istediginiz islemi seciniz...");
                for (int i = 0; i < actions.size(); i++) {
                    System.out.println(actions.get(i).description + " - " + (i + 1));
                }
                int userChoice = scan.nextInt();

                switch (userChoice) {

                    case 1: {
                        // Para yatirma ozelligini aktif hale getirin...
                    /*
                    Kullaniciya ait hesaplari listeleyerek hangi hesap numarasina para yatirmak istedigini sorun...
                    Kullanicinin sectigi hesap numarasi hatali ise ikaz ederek tekrar basa dondurun...
                    Secim confirmAccountNumber(currentCustomer, chosen); methodu tarafindan dogrulanirsa
                    Ne kadar para yatirmak istedigini sorun...
                    Ve kullanicinin girdisini alarak hesaptaki para miktarini arttirin...
                     */
                        while (true) {
                            System.out.println("Para yatırmak istediğiniz hesabı numarasını girin= ");

                            for (Account a : aktifKullanici.accounts)
                                System.out.println("Hesap No= " + a.number);

                            String chosen = scan.next();
                            secilenHesap = confirmAccountNumber(aktifKullanici, chosen);
                            if (secilenHesap == null) {
                                System.out.println("Hatalı hesap numarası girdiniz.");
                                continue;
                            }
                            break;}
                            System.out.println("Yatırılacak tutarı giriniz= ");
                            int yatan = scan.nextInt();

                            secilenHesap.paraMiktar += yatan;
                            break;
                        }


                        case 2: {

                            while (true) {
                                // Burada artik sadece o kullaniciya ait banka hesaplari listeleniyor... CLASS kullanmainin faydalari...
                                System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                                for (Account account : aktifKullanici.accounts) {
                                    System.out.println(account.number);
                                }
                                String secim = scan.next();
                                // confirmAccountNumber() methodunu kullanicinin dogru hesap bilgileri girdigini teyit etmek amacli kullanacaksiniz..
                                secilenHesap = confirmAccountNumber(aktifKullanici, secim);
                                if (secilenHesap == null) {
                                    System.out.println("Hatali hesap numarasi girdiniz...");
                                    continue;
                                }
                                System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                                int cekilecekPara = scan.nextInt();
                                // withdraw() methodunu kullanicinin hesabinda yeterli bakiye varsa bakiyesinden paranin dusulmesi,
                                // Yeterli bakiye yoksa kullanicinin uyarilmasi maksadiyla kullanacaksiniz...Olusturun
                                if (!withdraw(secilenHesap, cekilecekPara)) {
                                    break;
                                }
                            }
                            break;
                        }

                        case 3: {
                            System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                            break;
                        }

                        case 4:
                            System.exit(1);

                        default: {
                            System.out.println("Basarili bir secim yapmadiniz...");
                        }

                    }
                }
            }

            // TODO - Asagidaki 3 methodun return tipini ve icerigini tanimlayin ki yukarida olmasi gerektigi gibi sonuc versinler...



        public static Customer confirmUsernameAndPassword(List<Customer> users, String username, String password){
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).username.equals(username) && users.get(i).password.equals(password))

                    return users.get(i);
            }
            return null;
        }

        public static Account  confirmAccountNumber(Customer currentUser, String chosenAccount){
            Integer secim=Integer.parseInt(chosenAccount);
            for (Account a : currentUser.accounts){
                if (a.number==secim)

                    return a;
            }
            return null;



        }

        private static boolean withdraw(Account chosenAccount, int amountToWithdraw) {

           if (chosenAccount.paraMiktar<amountToWithdraw) {
               System.out.println("Bakiyeniz Yetersiz");
               return true;
           }
         chosenAccount.paraMiktar-=amountToWithdraw;
            System.out.println("Paranızı alınız. Kalan Tutar= "+chosenAccount.paraMiktar);

            return false;
        }

    }




