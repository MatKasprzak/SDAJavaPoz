package methods;

import java.util.Scanner;

public class Controlllers {
    Snake snake = new Snake();

    public static void controller(Snake snake, GameFieldClass[] gameField) {
        Scanner sc = new Scanner(System.in);
        int turn = sc.nextInt();
        int currentdirection = 0;
        switch (turn) {
            case 0: {
                SnakeMethods.directionMover(currentdirection, snake, gameField);
            }
            case 1: {
                if (currentdirection == 0) {
                    currentdirection = 3;
                } else {
                    currentdirection += 1;
                }
                SnakeMethods.directionMover(currentdirection, snake, gameField);

            }
            case 2: {
                if (currentdirection == 3) {
                    currentdirection = 0;
                } else {
                    currentdirection -= 1;
                }
                SnakeMethods.directionMover(currentdirection, snake, gameField);
            }
        }
    }
}