package Gun38._02_Abstract;

public class main {
    public static void main(String[] args) {

        Dikdortgen d=new Dikdortgen(5,4);
        d.setName("Yeni Diködrtgen");
        d.ciz();
        System.out.println(d);

        Daire dr=new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println(dr);
    }
}
