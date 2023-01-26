package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {

        int sayac=0;

        sayac=sayac+1; // sayacın degerini 1 tane arttırıyor  : 1
        sayac++;       // sayacın değerini 1 tane arttırıyor aynı işlem :2
        ++sayac;       // sayacın değerini 1 tane arttırıyor aynı işlem :3

        sayac=sayac-1; // sayacın degerini 1 tane azaltıyor  : -1
        sayac--;       // sayacın değerini 1 tane azaltıyor aynı işlem : -2
        --sayac;       // sayacın değerini 1 tane azaltıyor aynı işlem : -3

        System.out.println("sayac = " + sayac);

        /************************/

        int toplam= 5 + sayac;  // 5 olur
        System.out.println("toplam1 = " + toplam);   // 5
        System.out.println("sayac1 = " + sayac);     // 0

        toplam= 5 + sayac++;    //toplam = 5 + sayac sonra sayac=sayac+1, sonuc 5 dir ve sayac=1 oldu
        System.out.println("toplam2 = " + toplam);   // 5
        System.out.println("sayac2 = " + sayac);     // 1

        toplam= 5+ ++sayac;     //sayac=sayac+1 sonra toplam 5+sayac, 7olur
        System.out.println("toplam3 = " + toplam);   // 7
        System.out.println("sayac3 = " + sayac);     // 2

        //özet: ++ lar sağda ise önce işlem sonra artış
        //      ++ lar solda ise önce artış sonra işlem




    }
}
