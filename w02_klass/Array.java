import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> coffes = new ArrayList<String>();
        coffes.add("Latte");
        coffes.add("Cappuccino");
        coffes.add("Macchiato");
        
        // coffes.set(2, "Espresso");
        // coffes.remove(2);

        System.out.println(coffes);
        System.out.println(coffes.size()); //Lists olevate elementide arv
    }
}
