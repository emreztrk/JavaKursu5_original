package Gun17;

public class _01_JavaArray_Soru {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int [] dizi=new int[50];

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]= (int) (Math.random()*11);

        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi önce="+dizi[i]);

            if (dizi[i]%2==0)
                dizi[i]=0;
            else
                dizi[i]=1;

        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi sonra="+dizi[i]);
        }








    }
}
