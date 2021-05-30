import java.util.HashMap;

public class CheeseBurger implements Calories{
    private String string;

    public CheeseBurger(String string){
        this.string = string;
    }
    
    @Override
    public String name(){
        return "This a beef cheeseburger!";
    }

    @Override
    public String ingridients() {
        return "Ingridients: Hamburger bun, mayo, cheese, beef paddie, lettuce, tomato, onion.";
    }

    @Override
    public void calories() {
        System.out.println(string +" contains about 570 calories.");  
    }

    @Override
    public void prize() {
        System.out.println(string + " costs 4,95€");
    }

    @Override
    public void nutrition() {
        HashMap<String, Integer> nutrition = new HashMap<String, Integer>();
        nutrition.put("Fat", 110);
        nutrition.put("Cholesterol", 10);
        nutrition.put("Carbs", 90);
        nutrition.put("Protein", 40);

        System.out.println("\nNutritions:");
        for (String key : nutrition.keySet()) {
            System.out.println(key + " = " + nutrition.get(key) + "g");
        }
    
    
}
}
