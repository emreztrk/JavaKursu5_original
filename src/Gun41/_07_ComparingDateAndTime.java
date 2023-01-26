package Gun41;

import java.time.LocalDate;

public class _07_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        boolean sonraMi=bugun.isAfter(dun); // bugun dünden sonra mı
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi= bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi=bugun.isLeapYear(); // bugn artık yıl mı?
        System.out.println("artikYilMi = " + artikYilMi);
    }
}
