import methods.Controlllers;
import methods.GameFieldClass;
import methods.Snake;
import methods.SnakeMethods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        GameFieldClass[] gameField = new GameFieldClass[2000];
        SnakeMethods.gameFiledFiller(gameField);
        SnakeMethods.filedPriter(gameField);
        Snake snake = new Snake();
        snake.snakeInitialize(gameField);
        while (true) {
            Controlllers.controller(snake, gameField);

        }

    }
}