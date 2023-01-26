package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {

        // Math.random(): double sayı üretir. 0 - 0,99999999 arası üretir.

        double randSayi = Math.random();
        System.out.println("randSayi = " + randSayi);

        // 0-6 üretsin. 6 ile çarparsın. 0- 5,99999 olur. int e çevirsek 0-5;

        int rndTamSayi = (int) (Math.random() * 6);
        System.out.println("rndTamSayi = " + rndTamSayi);


    }
}
