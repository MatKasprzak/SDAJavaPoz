package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake{
   public List<GameFieldClass> snakeBody = new ArrayList<>();
   public int currentdirection =0;

   public void snakeInitialize(GameFieldClass[] table){
       snakeBody.add(table[975]);
       table[975].taken = true;
       snakeBody.add(table[976]);
       table[976].taken = true;
       snakeBody.add(table[977]);
       table[977].taken = true;
   }

   public  void snakeMovement(List<GameFieldClass> snake, GameFieldClass head, GameFieldClass[] table){
       if (head.taken == true && head.dot == false){
           System.out.println("Przegrałeś");
          System.exit(0);
       }
       snake.add(head);
       for(int i = snake.size() - 1; i > 0; i--){
           snake.set(i , snake.get(i-1));
       }
       if (head.dot == false){
           GameFieldClass lastField = snake.get(snake.size() -1);
           lastField.taken = false;
           snake.remove(snake.size() - 1);
       }
       if (head.dot == true){
           head.dot = false;
           SnakeMethods.randomDot(table);
       }
       snake.set(0, head);
       for (GameFieldClass field: snake){
           field.taken = true;
       }
   }

}
