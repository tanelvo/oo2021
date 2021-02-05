//
public class First{
    public static void main(String[] args){
        //  public static = vajalik käsu andmiseks
        //  main = käsk alati käivitatakse
        //  System.out.println(args.length);
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];

        // Muutujad
        String name = "Tanel";
        int year = 2021;
        byte bait = Byte.MAX_VALUE; // 127
        long myLong = Long.MAX_VALUE;
        short myShort = Short.MAX_VALUE;
        double doubleNumber = 3.4;
        float floatNumber = 3.4f; //f lõpus on vajalik
        boolean flag = true; // false
        char character = 'F';

        //  for tsükkel
        for (int i = 0; i < args.length; i++){
            Syestem.out.println(args[i]);
        }

        //  foreach tsükkel
        for (String text : args){
            System.out.println(text);
        }

        //  while tsükkel
        int length = args.length;
        while (length > 0){
            length--;
            System.out.println("inside while");
        }


        System.out.println("Hello World");
        System.out.println("Test");
        System.out.print("\n");
        System.out.println("Test2");
        
        String hello = "Hello World!";
        System.out.println(hello);
    }
}

// ALT+SHIFT+A kommenteerib valitud osa välja:
        /* System.out.println("Hello World");
        System.out.println("Test");
        System.out.println("\n");
        System.out.println("Test"); */

// kirjuta "main" + tab, et kiirelt luua ülemine asi

