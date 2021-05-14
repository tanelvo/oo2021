public class Main {
    public static void main(String[] args) {
      EstonianID est = new EstonianID("39906290838");
      FinnishID fin = new FinnishID("230181-237J");

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
    }
  }
