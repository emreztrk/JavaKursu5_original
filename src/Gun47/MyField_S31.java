package Gun47;

public class MyField_S31 {
    int x;  // default 0
    int y;  // default 0

    public void doStuff(int x, int y) {

        x = x;  //  parametreye parametre atadın nesnenin kendi x i değişmedi, default 0
        y = this.y; //nesnenin y değişti mi, hayır default 0 kaldı
    }

    public void display() {
        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField_S31 m1 = new MyField_S31();
        m1.x = 100;
        m1.y = 200;
        //System.out.println("m1.x = " + m1.x);
        //System.out.println("m1.y = " + m1.y);

        MyField_S31 m2=new MyField_S31();
        m2.doStuff(m1.x, m2.y); //100 200 gitti

        m1.display();   // 100 200
        m2.display();   // 0    0
    }
}
