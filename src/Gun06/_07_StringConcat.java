package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {

        //concat: bir string diğerine birleştiriyor.

        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("birleşik hali=" +s1+s2);
        System.out.println("birleşik hali1=" + s1.concat(s2));  //birleşmiş hali
        System.out.println("birleşik hali2=" + s1.concat(" ").concat(s2));
        System.out.println("birleşik hali3=" + s1.concat(" " + s2));
        System.out.println("birleşik hali4=" + s1.concat(" Venüs"));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


    }
}
