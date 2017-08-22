package Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Quizz {

    private static final String PATH_TO_RESULT = "C:\\Users\\RENT\\Downloads\\untitled2\\src\\Quiz\\wyniki.txt";
    private static final String PATH_TO_QUESTIONS = "C:\\Users\\RENT\\Downloads\\untitled2\\src\\Quiz\\pytania.txt";
    public static List<String> getRanking() {
        List<String> result = null;
        String filename = "wyniki.txt";
        //odczytać z pliku "wyniki.txt"
        //zwrócić te wyniki
        try {
            result = Files.readAllLines(Paths.get(PATH_TO_RESULT));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

        public List<Question> readAllQuestions() {

            List<String> questionsFromFile = null;
            List<Question> questionList = new ArrayList<>();
            try {
                questionsFromFile = Files.readAllLines(Paths.get(PATH_TO_QUESTIONS));
            } catch (IOException e) {
                e.printStackTrace();
            }
            for(int i = 0; i < questionsFromFile.size(); i += 6){
                Question question = new Question();
                question.setTitle(questionsFromFile.get(i));
                question.getAnswers().add(questionsFromFile.get(i + 1));
                question.getAnswers().add(questionsFromFile.get(i + 2));
                question.getAnswers().add(questionsFromFile.get(i + 3));
                question.getAnswers().add(questionsFromFile.get(i + 4));
                question.setCorrectAnswer(questionsFromFile.get(i + 5));
                questionList.add(question);
            }
            return questionList;
        }
    }

