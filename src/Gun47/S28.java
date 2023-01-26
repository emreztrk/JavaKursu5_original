package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S28 {
    public static void main(String[] args) {

        List<Object> color= new ArrayList<>();
        color.add("green");
        color.add("blue");
        color.add("red");
        color.add("yellow");

        color.remove(2);
        color.add(3,"cyan");
        //son sıraya denk gelen indexe eklenebilir
        // ama ondan daha büyük bir indexe eklenemez hata verir.
        System.out.println("color = " + color);
    }
}
