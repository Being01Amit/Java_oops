package classes_and_objects;

public class Abstraction {

    /* This method is override from the interfaces */
    public static void main(String[] args){

        Audi a1 = new Audi();
        a1.price(30);
        a1.breaks();
        System.out.println("Audi price is "+a1.price);

        System.out.println();

        BMW b1 = new BMW();
        b1.price(40);
        b1.breaks();
        System.out.println("BMW price is "+b1.price);
    }
}

class Audi extends Cars{

    @Override
    public void price(int price) {
        this.price = price;
    }

    @Override
    void start() {
        System.out.println("Audi is Started");
    }

    @Override
    void carSpeed() {
        System.out.println("Car is Too Fast");
    }
}

class BMW extends Cars{

    @Override
    public void price(int price) {
        this.price = price;
    }

    @Override
    void start() {
        System.out.println("BMW is started");
    }

    @Override
    void carSpeed() {
        System.out.println("Car is Too Fast");
    }

}

/* Now the Cars class is abstract class so we cannot create object of this class
Because car class is now only behave like  concept now we only use the properties and behaviour of this class */
abstract class Cars{
    int price;
    int speed;

    /* Now this class is Abstract so the Function of this class is also be abstracted
    so there is no need to be declare any body of the abstract function */
    abstract void start();
    abstract void carSpeed();

    public abstract void price(int price);

    /* In the Abstract class we can create concrete function
    * concrete function are those function which are have their Body like Breaks function */
    void breaks() {
        System.out.println("Breaking system is working");
    }
}
