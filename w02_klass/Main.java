import java.util.ArrayList;

import javax.print.attribute.standard.PrinterInfo;

public class Main{
    public static void main(String[] args) {
        GameCharacter character1 = new GameCharacter("Jaanus", GameCharacterType.RANGER);

        character1.x = 50;

        System.out.println(
            character1.name + " " +
            character1.getSecret());

        
       character1.setSecret("My new secret");
       System.out.println(character1.getSecret());

       GameCharacter character2 = new GameCharacter("Frolov", GameCharacterType.WARRIOR);

       System.out.println(character1);
       System.out.println(character2);

       System.out.println(character1.getXY()[1]);
    }

    public static void human(){
        Human human1 = new Human();
        System.out.println(human1.legs + " " + human1.name);

        Human human2 = new Human("kati");
        human2.legs = 10;

        System.out.println(human2.name + " " + human2.legs);
    }

    public static void lists(){
        String[] stringArray = new String[5];
        int[] numberArray = new int[5];
    
        ArrayList<String> stringList = new ArrayList<>();
    
        numberArray[0] = 5;
            
        stringList.add(0, "Hello");
        stringList.add("Yellow");
        stringList.add(1, "orange");
        for(String entry : stringList){
            System.out.println(entry);
         }
        System.out.println(stringList.get(1));
    
    for(String entry : stringList){
        System.out.println(entry);
      }
  
      System.out.println(stringList.get(1));
}}