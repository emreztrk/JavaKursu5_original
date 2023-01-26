package Gun26._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.


        Person emp=new Person();
       emp.name="Emre";
       emp.surname="Öztürk";
       emp.age=24;

        Person emp1=new Person();
        emp1.name="Nursen";
        emp1.surname="Yüzbaşıoğlu";
        emp1.age=45;

        //1.Yöntem
        System.out.println("name = " + emp.name);
        System.out.println("surname = " + emp.surname);
        System.out.println("age = " + emp.age);

        System.out.println("name = " + emp1.name);
        System.out.println("surname = " + emp1.surname);
        System.out.println("age = " + emp1.age);

        System.out.println("-----------2.Yöntem--------------------");

        //2.Yöntem
        BilgiYazdir(emp);
        BilgiYazdir(emp1);

        System.out.println("-----------3.Yöntem--------------------");

        //3.Yöntem, metodu ait olduğu classdan cağırıyoruz (persondan)
        emp.BilgiYazdir();
        emp1.BilgiYazdir();

        System.out.println("-----------4.Yöntem--------------------");

        //4Yöntem, toString metodunu class dan çağırdık
        System.out.println("emp = " + emp);

        emp.getBirthYear();
        emp1.getBirthYear();

        emp.getInitials();
        emp1.getInitials();



    }
    public static void BilgiYazdir(Person emp)
    {
        System.out.println("name = " + emp.name);
        System.out.println("surname = " + emp.surname);
        System.out.println("age = " + emp.age);
    }
}
