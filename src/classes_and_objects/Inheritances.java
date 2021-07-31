package classes_and_objects;

public class Inheritances {
    public static void main(String[] args){

        //        Person p1 = new Person("Amit", 19);
//        p1.eat();
//        p1.walk();
//
//        Person p2 = new Person("Sandeep",20);
//        p2.eat();
//        p2.walk();
//
//        System.out.println(p1.name+" "+p1.age);
//        System.out.println(p2.name+" "+p2.age);

        Developer d1 = new Developer("Anuj", 19);
        /*this are the properties of the Person class but
        the Developer class is inherit the properties of
        the Person class so the Developer can access
        the all function of the parent class */
        d1.eat();
        d1.walk();
        System.out.println(d1.name+" "+d1.age);

    }

}
class Developer extends Person{

    /*Constructor of Developer class because
    the Person class has the constructor of the Name and age this is must to create
     the child class has the constructor of the parent class*/
    public Developer(String name, int age){
        super(name, age); /* we uae super keyword to call parent class constructor in the children class */

    }

}

class Person{

    int age;
    String name;

    public Person (String name,int age){
        this.name= name;
        this.age = age;
    }

    void eat(){
        System.out.println("Person can eat");
    }

    void walk(){
        System.out.println("Person can walk");
    }

}
