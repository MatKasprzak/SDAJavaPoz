package Que;

public class Queue {

    private int[] queue;
    private int counterGet = 0;
    private int counterAdd = 0;

    public Queue (int size){
        this.queue = new int[size];
    }

    public void Add (int el) {
        if (counterAdd > queue.length -1 && counterGet > 0) {
            counterAdd = 0;
        }
        if (counterAdd != counterGet)
        this.queue[this.counterAdd] = el;
        this.counterAdd++;

    }

    public int Get () {

        if (counterGet > queue.length -1 && counterAdd > 0) {
            counterGet = 0;
        }
        int temp = this.queue[this.counterGet];
        counterGet++;

        return temp;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.Add(1);
        queue.Add(2);
        queue.Add(3);
        queue.Add(4);
        queue.Add(5);
        queue.Add(6);
        queue.Add(7);
        queue.Add(8);
        queue.Add(9);
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        queue.Add(10);
        queue.Add(11);
        queue.Add(12);
        queue.Add(13);
        queue.Add(14);
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());
        System.out.println(queue.Get());

    }
}
