package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=34;

        int sonuc1=toplamBul(s1,s2);
        System.out.println("sonuc1 = " + sonuc1);
        int sonuc2=toplamBul(s1,s2,s3);
        System.out.println("sonuc2 = " + sonuc2);

        String ad="Emre";
        String soyad="Öztürk";
        String sonuc3=toplamBul(ad,soyad);
        System.out.println("sonuc3 = " + sonuc3);
    }
    public static int toplamBul(int s1, int s2)
    {
        return s1+s2;
    }
    public static int toplamBul(int s1, int s2, int s3)
    {
        return s1+s2+s3;
    }
    public static String toplamBul(String ad, String soyad)
    {
        return ad+" "+soyad;
    }
}
