package homework;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class homework2 {
    public static void main(String[] args) throws IOException {
        
        List<String> names = new ArrayList<>();
        List<String> foods = new ArrayList<>();
        names.add("Armin");
        names.add("Eren");
        names.add("Reiner");
        foods.add("Jäätis");
        foods.add("Lihapallid");
        foods.add("Kartul");

        FileWriter writer = new FileWriter("homework2.txt");

        String text = IntStream.range(0, names.size())
                      .mapToObj(i -> names.get(i) + ":" + foods.get(i))
                      .collect(Collectors.joining(",\n"));

        writer.write(text);
        writer.close();

        ////////////////////////////////////////////////////////

        String content = "Tere maailm :)";
        Files.write(Paths.get("homework3.txt"), content.getBytes());
        
}
}

