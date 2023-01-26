package Gun41;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _05_Duration {

    // Duration : hem LocalTime hem de LocalDateTime arasındaki farkı verir. 

    public static void main(String[] args) {
        
        // LocalTime
        LocalTime dersBaslangic= LocalTime.of(19,0,0);
        LocalTime dersBitis= LocalTime.of(22,0,0);

        Duration GunlukDersSuresi=Duration.between(dersBaslangic,dersBitis);
        System.out.println("GunlukDersSuresi = " + GunlukDersSuresi);

        System.out.println(".toHours() = " + GunlukDersSuresi.toHours());
        System.out.println(".toMinutes() = " + GunlukDersSuresi.toMinutes());
        System.out.println(".toMillis() = " + GunlukDersSuresi.toMillis());

        // LocalDateTime *** 2 Tarih-saat arasındaki far ***
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println(".toDays() = " + farkZaman.toDays());
        System.out.println(".toHours() = " + farkZaman.toHours());
        System.out.println(".toMinutes() = " + farkZaman.toMinutes());


    }
}
