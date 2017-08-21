package fileAndDirectory;

import java.io.*;
import java.util.Scanner;

public class FileOverview {
    public static void createDirectoryAndFile() throws IOException {
        //1.Zapytac o nazwe katalogu
        //2.Stworzyć katalog o podanej nazwie
        //3.Zapytac o notatke
        //4. Dopisać date i zapisać notatke w pliku o nazwie notatka.txt

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe katalogu");
        String directoryName = sc.nextLine();
        File file = new File(directoryName);
        if (file.exists()) {
            System.out.println("Katalog istnieje");
        } else {
            boolean mkdir = file.mkdir();
            if (mkdir) {
                System.out.println("Utworzono Katalog");
            } else {
                System.out.println("Nie udało się utworzyć katalogu");
                //To samo z uzyciem operatora trojargumentowego System.out.println(file.mkdir() ? "utowrzono katalog" : "Nie udało się");
            }
        }
        System.out.println("Podaj notatke");
        String note = sc.nextLine();
        System.out.println("Podaj nazwe pliku");
        String noteName = sc.nextLine();
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(directoryName + "\\" + noteName + ".txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(note);
            bufferedWriter.flush();
            System.out.println("Utworzono plik: " + noteName);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}