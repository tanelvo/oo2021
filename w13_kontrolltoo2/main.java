import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// **Sõnade lõputähed**
// Salvesta uurimiseks vähemalt paarileheküljeline tekst.
//  Trüki välja sõnade viimased tähed
//  Väljasta erinevad sõnalõputähed nende esinemissageduse järjekorras
//  Iga lõputähega sõnade jaoks on eraldi fail, kuhu need tekstist kirjutatakse. Luuakse HTML-leht viidetega tekstis esinenud lõputähtedega failidele, iga viite juures arv, mitu korda vastava lõputähega sõna esines.


public class main {
    public static void main(String[] args){
        lastLetter();
    }

    public static void lastLetter(){
        ArrayList<String> text = new ArrayList<String>();
        ArrayList<String> cleanText = new ArrayList<String>();
        ArrayList<String> eachLetter = new ArrayList<String>();
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



        int wordCount = text.size();
        
        for(int i = 0; i < wordCount; i++){

            

            if((text.get(i)).contains(",")){
                cleanText.add(((text.get(i)).replace(",","")).toLowerCase());
            }
            else if((text.get(i)).contains("-")||(text.get(i)).contains("-")){
            }
            else if((text.get(i)).contains(".")){
                cleanText.add(((text.get(i)).replace(".","")).toLowerCase());
            }
            else if((text.get(i)).contains("?")){
                cleanText.add(((text.get(i)).replace("?","")).toLowerCase());
            }
            else if((text.get(i)).contains("!")){
                cleanText.add(((text.get(i)).replace("!","")).toLowerCase());
            }
            else if((text.get(i)).contains(";")){
                cleanText.add(((text.get(i)).replace(";","")).toLowerCase());
            }
            else if((text.get(i)).contains(":")){
                cleanText.add(((text.get(i)).replace(":","")).toLowerCase());
            }
            else if((text.get(i)).contains("'")){
                cleanText.add(((text.get(i)).replace("'","")).toLowerCase());
            } else {
                cleanText.add((text.get(i)).toLowerCase());
            }

            
        }   
        //System.out.println(cleanText);
        for (int i = 0; i < cleanText.size(); i++) {
            int wordLength = (cleanText.get(i)).length();           
            String letter = (cleanText.get(i)).substring(wordLength-1,wordLength);
            eachLetter.add(letter);
        }
        //System.out.println(eachLetter);

        //
        StringBuffer sb = new StringBuffer();
        for (String s : eachLetter) {
           sb.append(s);
           sb.append(" ");
        }
        String str = sb.toString();
        System.out.println(str);

        int frequency = 0 ;
        char character = ' ' ;
        String linesOfText = " " ; 
        char[] alphabet = new char[26] ; 
        for(char ch = 'a'; ch <= 'z'; ++ch)
        {
            alphabet[ch-'a']=ch ;
        } 
        linesOfText = str;
        System.out.println("Täht          Sagedus") ;
        for (int i = 0; i < alphabet.length; i++) 
        {   frequency = 0 ;
            for (int j = 0; j < linesOfText.length(); j++) {
                character = linesOfText.charAt(j) ;
                if (character == alphabet[i]) {
                    frequency++ ;
                }
            }

            System.out.println(alphabet[i] + "\t\t" + frequency) ;
        }

        }
        
}

