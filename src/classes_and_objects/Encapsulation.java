package classes_and_objects;

public class Encapsulation {

    public static void main(String[] args){

        Laptop l1 = new Laptop();
        l1.setPrice(30);
        System.out.println("Laptop price is = "+l1.price);

    }

}

class Laptop {

    protected int ram;
    protected int price;
    public boolean isAdmin = false;

    public void setPrice(int price){

        /* In this line of code we are achieving the Data hiding but with the protecting the data
        That is is Called Encapsulation */
        if(!isAdmin){
            System.out.println("Your Not Admin");
        }else {
            this.price = price;
        }
    }

}
