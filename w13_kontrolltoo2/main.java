import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        String path = "text.txt";
        // FileReader fr = new FileReader(str);
        String test = "See on testi lause";
        List<String> content = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

        System.out.println(content);
        //printLastChar(content);

        // Olen otsin parimat viisi ülesande lahenduseks

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
