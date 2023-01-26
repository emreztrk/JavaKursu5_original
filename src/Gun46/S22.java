package Gun46;

public class S22 {
    public static void main(String[] args) {

        String[][] chs= new String[5][2];
        chs[0]= new String[2];
        chs[1]= new String[5];
        int i=97;

        System.out.println("chs.length = " + chs.length);
        System.out.println("chs[0].length = " + chs[0].length);
        System.out.println("chs[1].length = " + chs[1].length);
        System.out.println("chs[2].length = " + chs[2].length);
        System.out.println("chs[3].length = " + chs[3].length);
        System.out.println("chs[4].length = " + chs[4].length);

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) { // chs[a].length olsaydı düzgün çalışcaktı
                chs[a][b]= "" + i;
                i++;
            }
        }
        for (String[] ca : chs){
            for (String c : ca){
                System.out.println(c+ " ");
            }
            System.out.println();
        }
        // ArrayIndexOutOfBoundsException hatası sorunun cevabı olmaluydu.
    }
}
