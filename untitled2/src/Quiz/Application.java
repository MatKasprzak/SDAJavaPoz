package Quiz;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;


        System.out.println("Witaj w quizie");
        // System.out.println("Podaj nick");
        // String nick = sc.nextLine();
        int n = -1;


        while (n != 0) {
            System.out.println("Wybierz opcje: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Nowy Quiz");
                    Quizz quizz = new Quizz();
                    List<Question> questions = quizz.readAllQuestions();
                    for (Question q : questions) {
                        System.out.println(q);
                    }
                    break;

                case 2:
                    System.out.println("Tablica wyników");
                    List<String> ranking = Quizz.getRanking();
                    if (ranking != null) {
                        for (String wynik : ranking) {
                            System.out.println(wynik);
                        }
                    } else {
                        System.out.println("Brak wyników");
                    }
                    break;
                case 3:
                    System.out.println("Wychodze z systemu");
                    n = 0;
                    break;
            }
        }

    }
}


//        try{
//        fileWriter = new FileWriter("quiz.txt");
//        bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write(note);
//        bufferedWriter.flush();
//        }catch (IOException e) {
//        e.printStackTrace();
//        }