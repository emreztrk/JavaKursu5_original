package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // bri kartvizit uygulamasını 2 kişi için yapınız.

        HashMap<String, String> uKartVizit=new HashMap<>();
        uKartVizit.put("isim","Emre Öztürk");
        uKartVizit.put("email","emreozturk0717@gmail.com");
        uKartVizit.put("adres","Çekmeköy/İstanbul");
        uKartVizit.put("telefon","05394654697");

        System.out.println("uKartVizit.get(isim) = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(telefon) = " + uKartVizit.get("telefon"));

        HashMap<String, String> aKartVizit=new HashMap<>();
        aKartVizit.put("isim","Ayşe Bayrak");
        aKartVizit.put("email","ayşe@gmail.com");
        aKartVizit.put("adres","Şişli/İstanbul");
        aKartVizit.put("telefon","0545000000");

        HashMap<String, HashMap<String,String>> kartvizitler=new HashMap<>();

        kartvizitler.put("emre",uKartVizit);
        kartvizitler.put("ayşe",aKartVizit);

        System.out.println("kartvizitler.get(emre) = " + kartvizitler.get("emre"));
        System.out.println("kartvizitler.get(ayşe) = " + kartvizitler.get("ayşe"));

        System.out.println("Ayşenin Adresi = " + kartvizitler.get("ayşe").get("adres"));

        // sadece emailleri almak için
        for (Map.Entry<String,HashMap<String,String>> kv:kartvizitler.entrySet()){
            System.out.println("emailler = " + kv.getValue().get("email"));
        }


    }
}
