package Gun37._02_Soru;

import Gun30._02_FinalVariables.Ornek2.Sabitler;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {

        Cat kedi=new Cat("Kara","Memeli");
        Duck ordek=new Duck("Kara/Su","Kuş");
        Shark buyukBeyaz=new Shark("Okyanus","Omurgalı/Balık");
        Swallow kirlangic=new Swallow("Kara","Kuş");

        ArrayList<Animal> hayvanlar=new ArrayList<>();
        hayvanlar.add(kedi);
        hayvanlar.add(ordek);
        hayvanlar.add(buyukBeyaz);
        hayvanlar.add(kirlangic);

        for (Animal a : hayvanlar){
            System.out.println("--------------------------------");
            System.out.println(a.getClass().getSimpleName());
            System.out.println("--------------------------------");

            System.out.println("a.getYasamAlani() = " + a.getYasamAlani());
            System.out.println("a.getTuru() = " + a.getTuru());

            if (a instanceof Cat){
                System.out.println(((Cat)a).food());
                System.out.println(((Cat)a).runs());
            }
            else
                if (a instanceof Duck){
                    System.out.println(((Duck)a).food());
                    System.out.println(((Duck)a).swims());
                }
                else
                    if (a instanceof Shark){
                        System.out.println(((Shark)a).food());
                        System.out.println(((Shark)a).swims());
                    }
                    else
                        if (a instanceof Swallow){
                            System.out.println(((Swallow)a).food());
                            System.out.println(((Swallow)a).flies());
                        }
        }
    }
}
