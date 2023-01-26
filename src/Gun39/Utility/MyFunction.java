package Gun39.Utility;

public class MyFunction {

    public static void Bekle(int sn){

        try {
            Thread.sleep(1000*sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // mili saniye kadar bekler ama 100 ile çarğarsan saniye kadar bekler
        }
    }
}
