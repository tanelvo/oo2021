import java.util.ArrayList;

public class primes {
public static void main(String[] args) {
    ArrayList<Integer> primes = new ArrayList<>();
    ArrayList<Integer> biggest = new ArrayList<>();
    int number = 2;
    int j = 1;

    while(primes.size() <1000){
        int i = 2;
        boolean prime = false;
        while (i <= number / 2) {
            if (number % i == 0) {
              prime = true;
              break;
            }
      
            ++i;
          }
        if (!prime){
        primes.add(number);
        ++number;} else { 
        ++number;}
    }
    System.out.println(primes);

    System.out.println("10 järgmist suurimat peale tuhandenda algarvu ruudu: ");
    while(j <= 10){
    int max = primes.get(999-j);
    biggest.add(max);
    j++;  
    }
    System.out.println(biggest);
  }
}
