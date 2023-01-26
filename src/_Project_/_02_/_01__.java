package _Project_._02_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01__ {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt=new Scanner(System.in);

        String kelime;

        do {
            System.out.print("Kullanıcı adını giriniz=");
            String user=scStr.nextLine();
            System.out.print("Şifrenizi giriniz=");
            String pass=scStr.nextLine();

            kelime=confirmUsernameAndPassword(user,pass);

        }while (!kelime.contains("Başarılı"));

        int userChoice;
        List<String> acc = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> fnd = new ArrayList<>(Arrays.asList(200, 1000, 5000));
        do {
            List<String> actions = new ArrayList<>(Arrays.asList("Para Yatır", "Para Çek", "Transfer", "Çıkış"));
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));
            }
            userChoice = scInt.nextInt();

            switch (userChoice) {
                case 1: {
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz");
                }
                break;
                case 2: {
                    System.out.println("Hangi hesaptan para cekmek istiyorsunuz?");
                    System.out.println("1234");
                    System.out.println("5678");
                    System.out.println("9999");
                    String hesap=scStr.nextLine();

                    for (int i = 0; i < acc.size(); i++) {

                        if (hesap.equals(acc.get(i))) {
                            System.out.println("Seçilen Hesap: " + acc.get(i));
                            System.out.println("Ne kadar çekmek istiyorsunuz? ");
                            int cekilen = scInt.nextInt();
                            if (fnd.get(i)>cekilen)
                                withdraw(acc, fnd, acc.get(i), cekilen);
                            else
                                System.out.println("Bakiyeniz Yetersiz");
                            break;
                        }
                        else
                            System.out.println("Hatalı Giriş Yaptınız");
                        break;
                        }
                }
                break;
                case 3: {
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                }
                break;
                case 4:
                    System.exit(1);

                default: {
                    System.out.println("Basarili bir secim yapmadiniz...");
                }

            }
        }while (userChoice!=6);


    }
    private static void withdraw(List<String> accounts, List<Integer> funds, String chosenAccount, int amountToWithdraw) {
        int sHesap;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(chosenAccount)){
                sHesap=funds.get(i)-amountToWithdraw;
                funds.set(i,sHesap);
            }
        }
        System.out.println("Hesap Son Durumu=");
        for (int i = 0; i < funds.size(); i++) {
            System.out.println((i+1)+". Hesap="+ funds.get(i));

        }
    }
    public static String confirmUsernameAndPassword(String u, String p) {
        String tanim = "";

        List<String> usernames = new ArrayList<>(Arrays.asList("user1", "user2", "user3"));
        List<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));
        List<String> digits = new ArrayList<>(Arrays.asList("1234", "5678", "9999"));
        List<Integer> money = new ArrayList<>(Arrays.asList(200, 1000, 5000));

        for (int i = 0; i < usernames.size(); i++) {

            if (u.equals(usernames.get(i)) && p.equals(passwords.get(i))) {
                tanim = "Başarılı bir şekilde giriş yaptınız";
                System.out.println(tanim);

                break;
            } else {
                tanim = "Sistemde kayıtlı böyle bir kullanıcı bulunumadı, lütfen tekrar deneyiniz";
                System.out.println(tanim);

                break;
            }
        }
        return tanim;
    }
}

