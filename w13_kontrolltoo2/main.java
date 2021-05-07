public class main {
    public static void main(String[] args) {
        String str = "See on testi lause";
        printLastChar(str);

    }
    static void printLastChar(String str)
    {
        str = str + " ";
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ')
                System.out.print(str.charAt(i - 1) + " ");
        }
    }
}
