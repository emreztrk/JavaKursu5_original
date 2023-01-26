package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _04_Period {
    public static void main(String[] args) {

        // period 2 tarih aarasındaki farkı gösterir
        // LocalDate ler için kullanılır.

        LocalDate dogumTarihi=LocalDate.of(1997,12,22);
        LocalDate bugun=LocalDate.now();

        Period fark= Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" Yaşındasınız");

        /******************************************************/

        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra= bugun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra=bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);

        /*************************************************/

        // Kursun Bitiş Tarihini Bulunuz.

        LocalDate kursBaslangic=LocalDate.of(2022,10,31);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis= kursBaslangic.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        Period neKadarSureKaldi= Period.between(bugun, kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        Period suAnaKadarDevamSuresi=Period.between(kursBaslangic,bugun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);








    }
}
