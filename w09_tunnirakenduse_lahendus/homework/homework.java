package homework;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class homework {
    public static void main(String[] args) throws IOException {
        /* List<String> names = Files
        .readAllLines(Path.of("homework.txt"));
        Stream<String> lines = names.stream();
        lines.forEach(System.out::println); */

        try (Stream<String> lines = Files.lines(Path.of("homework.txt"))) {
            var i = lines.filter(line -> line.startsWith("A"))
              .count();
            System.out.println("Inimesi, kelle nimed algavad tähega 'A' on " + i);
        }

        try (Stream<String> lines = Files.lines(Path.of("homework.txt"))) {
            var j = lines.filter(line -> line.startsWith("M"))
              .findFirst();
            System.out.println("Esimene inimestest, kelle nimi hakkab tähega 'M' on " + j);
        }
        // Kas leidub nime
        try (Stream<String> lines = Files.lines(Path.of("homework.txt"))) {
            var r = lines.filter(line -> line.startsWith("R"))
              .anyMatch(line -> line != "Rudolf");
            System.out.println(r);
          }
    }
}
