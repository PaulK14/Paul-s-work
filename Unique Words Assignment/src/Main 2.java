import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("illiad.txt"));
        HashSet<String> Wordle = new HashSet<String>();

        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
//Replace all the punctuation with spaces and change all uppercase letter to lowercase
            Wordle.add(word);
//Add all the words from the text to the hashset
        }
        System.out.println(Wordle.size() + " words");
        //print out how many words there are :D
    }
}
