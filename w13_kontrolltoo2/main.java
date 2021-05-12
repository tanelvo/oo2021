import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// **Sõnade lõputähed**
// Salvesta uurimiseks vähemalt paarileheküljeline tekst.
//  Trüki välja sõnade viimased tähed
//  Väljasta erinevad sõnalõputähed nende esinemissageduse järjekorras
//  Iga lõputähega sõnade jaoks on eraldi fail, kuhu need tekstist kirjutatakse. Luuakse HTML-leht viidetega tekstis esinenud lõputähtedega failidele, iga viite juures arv, mitu korda vastava lõputähega sõna esines.


public class main {
    public static void main(String[] args) throws IOException {
        lastLetter();
    }

    public static void lastLetter(){
        ArrayList<String> text = new ArrayList<String>();
        File textFromFile = new File("text.txt");

        // Exception scanneri pärast :(
        try{
        Scanner txt = new Scanner(textFromFile);
        while (txt.hasNext()){
            text.add(txt.next());}
            txt.close();
        } catch (FileNotFoundException txt){
            System.out.println("Tekkis viga");
        }
        
    }
}
