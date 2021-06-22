package classes_and_objects;

public class CO {

    public static void main(String[] args ){


        Person p1 = new Person();
        p1.name = "Amit";
        p1.age = 19;
        System.out.println("Person Name= " +p1.name +", Person Age= "+ p1.age);


    }

    static class Person{

        String name;
        int age ;
    }
}