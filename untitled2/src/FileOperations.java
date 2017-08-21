import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileOperations {
    public static String readFile(String path) throws InterruptedException {
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        String result = null;
        String line = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                Thread.sleep(100);
            }

            line = bufferedReader.readLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return stringBuilder.toString();
    }

    public static List<String> readAllLines(String path) {
        List<String> lista = null;
        try {
            lista = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
