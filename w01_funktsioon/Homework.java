public class Homework {
    public static void main(String[] args) {
        Float celsius = -15f;
        
        Float fahrenheit = ((celsius*9)/5)+32;
        System.out.println("The temperature is "+ fahrenheit + " degrees fahrenheit!");
        
        if (fahrenheit < 32){
            System.out.println("Vesi jäätub!!");
        } 
        if (fahrenheit > 212) {
            System.out.println("Vesi keeb!");
        } 
    }
}
 