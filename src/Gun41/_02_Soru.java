package Gun41;

import Gun39.Utility.MyFunction;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    // Canlı Dijştal Saat yapınız.

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true) {

            LocalTime saat = LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunction.Bekle(1);
        }


    }
}
