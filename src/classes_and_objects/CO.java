package classes_and_objects;

public class CO {

    public static void main(String[] args ){


        Person p1 = new Person(20, "Sandeep"); // we can pass the function in constructor and when the object is construct the object is initialize with values

        Person p2 = new Person(19, "Amit");

        System.out.println("Person Name = " +p1.name +", Person Age = "+ p1.age);
        System.out.println("Person Name = " +p2.name +", Person Age = "+ p2.age);

        System.out.println("Persons count "+ Person.count);

    }

    static class Person{

        String name;
        int age ;
        static int count; // Static keyword
        public Person(){
            System.out.println("Creating an Object");
        }

        //Constructor Overloading
       public Person(int newAge, String newName){
           count++;
            name = newName;
            age = newAge;
        }
    }
}