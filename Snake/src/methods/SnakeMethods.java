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
            if (table[i].x == 49) {
                y += 1;
            }
        }
        for (GameFieldClass field : table) {
            if (field.x == 49 || field.x == 0 || field.y == 0 || field.y == 39) {
                field.taken = true;
            }
        }
    }

    public static void fieldsPrinter(GameFieldClass[] table) {
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
        while (exit == false) {
            if (table[dotField].taken == true) {
                dotField = random.nextInt(2000);
            } else {
                table[dotField].dot = true;
                table[dotField].taken = true;
                exit = true;
            }
        }
        exit = false;

    }

    public static void directionMover(int currentdirection, Snake snake, GameFieldClass[] gameField) {

        if (currentdirection == 0) {
            int nextFieldId = snake.snakeBody.get(0).id + 1;
            GameFieldClass nextField = gameField[nextFieldId];
            snake.snakeMovement(snake.snakeBody, nextField, gameField);
            snake.snakeBody.set(0, gameField[nextFieldId]);
        }
        if (currentdirection == 1) {
            int nextFieldId = snake.snakeBody.get(0).id - 50;
            GameFieldClass nextField = gameField[nextFieldId];
            snake.snakeMovement(snake.snakeBody, nextField, gameField);
            snake.snakeBody.set(0, gameField[nextFieldId]);
        }
        if (currentdirection == 2) {
            int nextFieldId = snake.snakeBody.get(0).id - 1;
            GameFieldClass nextField = gameField[nextFieldId];
            snake.snakeMovement(snake.snakeBody, nextField, gameField);
            snake.snakeBody.set(0, gameField[nextFieldId]);
        }
        if (currentdirection == 3) {
            int nextFieldId = snake.snakeBody.get(0).id + 50;
            GameFieldClass nextField = gameField[nextFieldId];
            snake.snakeMovement(snake.snakeBody, nextField, gameField);
            snake.snakeBody.set(0, gameField[nextFieldId]);
        }
    }

    public static void gameFiledPriter(GameFieldClass[] table) {
        String result = "";
        for (GameFieldClass field : table) {

            if (field.taken == true) {
                result += "o";
            } else {
                result += "-";
            }
            if (field.x == 49) {
                result += '\n';
            }
        }
        System.out.println(result);
    }

}
