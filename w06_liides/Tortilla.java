import java.util.HashMap;

public class Tortilla implements Calories{
    private String string;
    public Tortilla(String string){
        this.string = string;
    }
    @Override
    public String name() {
        return "This is a spicy chicken tortilla";
    }

    @Override
    public String ingridients() {
        return "Ingridients: Tortilla wrap, salsa, lettuce, chicken, tomato, jalapeno.";
    }

    @Override
    public void calories() {
        System.out.println(string + " contains about 540 calories.");
    }

    @Override
    public void prize() {
        System.out.println(string + " costs 5€.");
    }

    @Override
    public void nutrition() {
        HashMap<String, Integer> nutrition = new HashMap<String, Integer>();
        nutrition.put("Fat", 80);
        nutrition.put("Cholesterol", 5);
        nutrition.put("Carbs", 60);
        nutrition.put("Protein", 30);

        System.out.println("\nNutritions:");
        for (String key : nutrition.keySet()) {
            System.out.println(key + " = " + nutrition.get(key) + "g");
        }
        
    }
    
}
