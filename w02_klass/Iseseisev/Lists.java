package Iseseisev;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;  

public class Lists {
    public static void main(String[] args) {
        
    }

public static void arrayList(){
    ArrayList<String> coffes = new ArrayList<String>();
        coffes.add("Latte");
        coffes.add("Cappuccino");
        coffes.add("Macchiato");
        
        // coffes.set(2, "Espresso");
        // coffes.remove(2);

        System.out.println(coffes);
        System.out.println(coffes.size()); //Lists olevate elementide arv
} 


public static void linkedList(String[] args){
    LinkedList<String> milks = new LinkedList<String>();
    milks.add("Cow milk");
    milks.add("Soy milk");
    milks.add("Almond milk");
    milks.add("Oat milk");

    System.out.println(milks);
  } 

public static void vector(String args[]) {  
    //Create a vector  
    Vector<String> sauces = new Vector<String>();  
    //Adding elements using add() method of List  
    sauces.add("Caramel");  
    sauces.add("Choclate");  
    sauces.add("Condensed milk");  
    sauces.add("Cinnamon");  
    //Adding elements using addElement() method of Vector  
    sauces.addElement("Rat");  
    sauces.addElement("Cat");  
    sauces.addElement("Deer");  
      
    System.out.println(sauces);  
 }  
}


