package Gun47;

public class MarkList_S30 {

    int num;

    public static void graceMarks(MarkList_S30 obj4){
        obj4.num+=10;
    }

    public static void main(String[] args) {
        MarkList_S30 obj1=new MarkList_S30();
        MarkList_S30 obj2=obj1;
        MarkList_S30 obj3=null;

        obj2.num=60;
        graceMarks(obj2);
    }
}
