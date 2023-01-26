package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _06_ZonedDateTime {
    public static void main(String[] args) {

        // Başka Zaman Bolgelerinin zaman bilgisini alma

        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println("zdt = " + zdt);
        // şu anda benim bulundugum default zamanı verir.

        Set<String > zamanBolgeleri= ZoneId.getAvailableZoneIds();

        for (String zone : zamanBolgeleri){
            if (zone.toLowerCase().contains("ıst"))
                System.out.println("zone = " + zone);
        }

        ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul=ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);


        }
    }

