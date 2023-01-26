package Gun16;

public class _05_JavaArray_Soru {
    public static void main(String[] args) {

        //5 tv kanalı ismini bir diziye doldurunuz.
        // daha sonra random olarak bir tanesini secip ekrana secileni yazdırınız.

        String[] kanal={"trt","atv","kanald","fox","habertürk"};

        int random= (int) (Math.random()*kanal.length); // 5 e kadar 5 dahil değil

        System.out.println("Random Seçilen Kanal="+kanal[random]);

















    }
}
