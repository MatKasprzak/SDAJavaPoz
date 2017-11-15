package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake{
   public List<GameFieldClass> snakeBody = new ArrayList<>();

   public void snakeInitialize(GameFieldClass[] table){
       snakeBody.add(table[975]);
       snakeBody.add(table[976]);
       snakeBody.add(table[977]);
   }

   public  void snakeMovement(List<GameFieldClass> snake, GameFieldClass head){
       for(int i = 0; i < snake.size(); i++){
           snake.set(i, snake.get(i+1));
       }
       snake.remove(snake.size() - 1);
       snake.set(0, head);
   }

}
