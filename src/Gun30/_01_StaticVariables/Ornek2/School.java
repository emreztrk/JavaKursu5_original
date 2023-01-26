package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student stu1=new Student(1,"İsmet Temur");
        Student stu2=new Student(2,"Mehmet Yılmaz");
        Student stu3=new Student(3,"Emre Öztürk");
        //Problem: hem id yi takip etmek zorundayım,
        //hem de hata olasılığı yüksek

        Student stu10=new Student("İsmet Temur");
        Student stu11=new Student("Mehmet Yılmaz");
        Student stu12=new Student("Emre Öztürk");
        System.out.println("stu10 = " + stu10);
        System.out.println("stu11 = " + stu11);
        System.out.println("stu12 = " + stu12);

    }
}
