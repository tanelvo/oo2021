import java.util.Scanner;
//import java.util.ArrayList;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	System.out.println("Sisesta arv, mida soovid kontrollida: ");
        int number = input.nextInt();

        //System.out.println(number);

        if(number % 2 == 0){
            System.out.println(number +" jagub kahega");
        }
        if(number % 3 == 0){
            System.out.println(number +" jagub kolmega");
        }
        if(number % 5 == 0){
            System.out.println(number +" jagub viiega");
        }
        if(number % 7 == 0){
            System.out.println(number +" jagub seitsmega");
        }

        // While loopiga kontrollime kas tegemist on algarvuga
        int i = 2;
        boolean prime = false;
        while (i <= number / 2) {
            if (number % i == 0) {
              prime = true;
              break;
            }
      
            ++i;
          }

          if (!prime)
      System.out.println(number + " on algarv.");
    else
      System.out.println(number + " ei ole algarv.");
      input.close();
  }
}