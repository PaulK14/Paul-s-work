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

            Wordle.add(word);

        }
        System.out.println(Wordle.size() + " words");
    }
}
