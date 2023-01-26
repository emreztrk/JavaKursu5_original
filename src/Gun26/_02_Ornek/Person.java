package Gun26._02_Ornek;

public class Person {
    String name;
    String surname;
    int age;
    int birth;

    public void BilgiYazdir()
    {
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }
    public void getBirthYear(){
        System.out.println("birth year= "+ (2022-age));
    }
    public String getBirthYear2(){
        return "dogum yılı = "+(2022-age);// böyle de olabilirdi
    }
    public void getInitials(){
        System.out.println(
                name.toUpperCase().charAt(0)+"."+
                        surname.toUpperCase().charAt(0)+".");
    }
    public String toString(){
        return name+" "+surname+" "+age;
    }
}
