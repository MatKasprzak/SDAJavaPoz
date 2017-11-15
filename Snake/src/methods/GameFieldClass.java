package methods;

public class GameFieldClass {
    public int id;
    public int x;
   public int y;
   public boolean taken = false;

    public GameFieldClass() {
    }

    public GameFieldClass(int id, int x, int y, boolean taken) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.taken = taken;
    }
}
