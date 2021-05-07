public class letters {
    static void printLastChar(String str)
    {
        str = str + " ";
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ')
                System.out.print(str.charAt(i - 1) + " ");
        }
    }
}