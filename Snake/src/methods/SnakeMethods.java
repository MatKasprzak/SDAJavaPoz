package methods;

import java.util.Random;

public class SnakeMethods {

    public static void gameFiledFiller(GameFieldClass[] table) {
        int x = 0;
        for (int i = 0; i < table.length; i++) {
            table[i] = new GameFieldClass();
            table[i].id = i;
            table[i].x = x;
            x++;
            if (x == 50) {
                x -= 50;
            }
        }
        int y = 0;
        for (int i = 0; i < table.length; i++) {
            table[i].y = y;
            if (i % 50 == 0) {
                y +=1;
            }
        }
    }

    public static void filedPriter(GameFieldClass[] table) {
        String result = " ";
        for (int i = 0; i < table.length; i++) {
            result += "id" + table[i].id + "x=" + table[i].x + " " + "y=" + table[i].y + " " + '\n';
        }
        System.out.println(result);
    }

    public static void randomDot(GameFieldClass[] table) {
        Random random = new Random();
        int dotField = random.nextInt(2000);
        boolean exit = false;
        while (exit = false) {
            if (table[dotField].taken = true) {
                dotField = random.nextInt(2000);
            } else {
                table[dotField].taken = true;
                exit = true;
            }
        }
    }
    public static void directionMover(int currentdirection, Snake snake, GameFieldClass[] gameField){

        if (currentdirection == 0) {
            int nextFieldId = snake.snakeBody.get(0).id + 1;
            snake.snakeBody.set(0, gameField[nextFieldId]);
            GameFieldClass nextField = new GameFieldClass();
            snake.snakeMovement(snake.snakeBody, nextField);
        }
        if (currentdirection == 1) {
            int nextFieldId = snake.snakeBody.get(0).id - 50;
            snake.snakeBody.set(0, gameField[nextFieldId]);
            GameFieldClass nextField = new GameFieldClass();
            snake.snakeMovement(snake.snakeBody, nextField);
        }
        if (currentdirection == 2) {
            int nextFieldId = snake.snakeBody.get(0).id - 1;
            snake.snakeBody.set(0, gameField[nextFieldId]);
            GameFieldClass nextField = new GameFieldClass();
            snake.snakeMovement(snake.snakeBody, nextField);
        }
        if (currentdirection == 3) {
            int nextFieldId = snake.snakeBody.get(0).id + 50;
            snake.snakeBody.set(0, gameField[nextFieldId]);
            GameFieldClass nextField = new GameFieldClass();
            snake.snakeMovement(snake.snakeBody, nextField);
        }
    }

}