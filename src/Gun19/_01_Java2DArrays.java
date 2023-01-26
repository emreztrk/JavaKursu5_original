package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo= {
                {3,  4, 55},
                {234,22,33}
        }; // 2 satır 3 sutun

        System.out.println("satır uzunluğu="+tablo.length);     // satır sayısı
        System.out.println("0.satır uzunluğu="+tablo[0].length);    //3, sutun uzunluğu
        System.out.println("1.satır uzunluğu="+tablo[1].length);    //3, sutun uzunluğu

        for (int i = 0; i < tablo.length; i++) {

            //ilgili satırdaki sutun uzunluğu
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
