package Program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordCounter {
    private static final String PATH_TO_FILE = "C:\\Users\\RENT\\Desktop\\sda-introduction-to-java\\sda-introduction-to-java\\sda-intermediate-21\\src\\Program\\slowa.txt";

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        Map<String, Integer> stringIntegerMap = wordCounter.countWords();

        for(String key: stringIntegerMap.keySet()){
            System.out.println("Słowo: " + key + " wystąpiło: " + stringIntegerMap.get(key) + "razy: ");
        }
    }

    public static List<String> getAllLinesFromFile() {

        List<String> linesFromFile = null;
        try {
            linesFromFile = Files.readAllLines(Paths.get(PATH_TO_FILE));
        } catch (IOException e) {
            System.out.println("nieprawidłowa nazwa plku");
            e.printStackTrace();
        }
        return linesFromFile;
    }

    public static List<String> getAllWords() {
        List<String> lines = getAllLinesFromFile();
        List<String> pojedynczeSlowaListaWynikowa = new ArrayList<>();
        //dla każdej linijki wykonuj:
        for (String line : lines) {
            String[] pojedynczeSlowaLinijki = line
                    .replace(",", "")
                    .replace(".", "")
                    .split(" ");


            pojedynczeSlowaListaWynikowa.addAll(Arrays.asList(pojedynczeSlowaLinijki));
        }
        return pojedynczeSlowaListaWynikowa;
    }

    public static Map<String, Integer> countWords() {
        Map<String, Integer> mapOfWords = new HashMap<>();
        List<String> allWords = getAllWords();
        for (String slowo : allWords) {
            if (mapOfWords.containsKey(slowo)) {
                Integer value = mapOfWords.get(slowo);
                value++;
                mapOfWords.put(slowo, value);
            } else {
                mapOfWords.put(slowo, 1);
            }
        }
        return mapOfWords;
    }
}
