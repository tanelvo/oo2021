import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      EstonianID est = new EstonianID("39906290838");
      FinnishID fin = new FinnishID("230181-237J");
      CheeseBurger burger = new CheeseBurger("Beef burger");
      Tortilla tortilla = new Tortilla("Spicy Chicken Tortilla");

        System.out.println("Eesti ID:");
        System.out.println(est.getGender());
        System.out.println(est.getFullYear());
        System.out.println(est.getDOB());
        System.out.println(est.getAge());

        System.out.println("\nSoome ID:");
        System.out.println(fin.getGender());
        System.out.println(fin.getFullYear());
        System.out.println(fin.getDOB());
        System.out.println(fin.getAge());


        
        ArrayList<Calories> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(tortilla);

        System.out.println("Food:");
        for(Calories i : foods) {
            System.out.println(i.name());
            System.out.println(i.ingridients());
            i.ingridients();
            i.calories();
            i.nutrition();
            System.out.println();
        }



    }
  }
