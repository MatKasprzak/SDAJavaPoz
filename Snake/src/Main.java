import methods.Controlllers;
import methods.GameFieldClass;
import methods.Snake;
import methods.SnakeMethods;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        GameFieldClass[] gameField = new GameFieldClass[2000];
        SnakeMethods.gameFiledFiller(gameField);
        SnakeMethods.fieldsPrinter(gameField);
        Snake snake = new Snake();
        snake.snakeInitialize(gameField);
        SnakeMethods.randomDot(gameField);
        System.out.println("Start!");
        while (true) {
            System.out.println("Punkty: " + (snake.snakeBody.size() - 3));
            SnakeMethods.gameFiledPriter(gameField);
            Controlllers.controller(snake, gameField);


        }

    }
}