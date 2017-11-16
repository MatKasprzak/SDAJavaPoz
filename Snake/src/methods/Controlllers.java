package methods;

import java.util.Scanner;

public class Controlllers {
    Snake snake = new Snake();

    public static void controller(Snake snake, GameFieldClass[] gameField) {
        Scanner sc = new Scanner(System.in);
        int turn = sc.nextInt();
        switch (turn) {
            case 0: {
                SnakeMethods.directionMover(snake.currentdirection, snake, gameField);
                break;
            }
            case 1: {
                snake.currentdirection += 1;
                if (snake.currentdirection == 4) {
                    snake.currentdirection = 0;
                }
                SnakeMethods.directionMover(snake.currentdirection, snake, gameField);
                break;
            }
            case 2: {
                snake.currentdirection -= 1;
                if (snake.currentdirection == -1) {
                    snake.currentdirection = 3;
                }
                SnakeMethods.directionMover(snake.currentdirection, snake, gameField);
                break;
            }
        }
    }
}