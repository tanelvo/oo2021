package Iseseisev;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("Latte", CoffeType.Latte, Size.Medium);

        System.out.println(
            coffee1.many + " " +
            coffee1.size + " " +
            coffee1.name);


        Coffee coffee2 = new Coffee("Cappuccino", CoffeType.Cappuccino, Size.Large);
        
        coffee2.many = 2;

        System.out.println(
            coffee2.many + " " +
            coffee2.size + " " +
            coffee2.name);
    }

    public static void cost(){
        

    }
}
        