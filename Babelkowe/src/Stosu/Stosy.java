package Stosu;

import java.util.Scanner;
import java.util.Stack;

public class Stosy {
    private int[] heap;
    private int counter = 0;

    public Stosy (int size){
        this.heap = new int[size];

    }
    public void push(int el){
        this.heap[this.counter] = el;
        this.counter++;
    }

    public int pop() {
        if (counter > 0) {
            this.counter--;
            return this.heap[this.counter];
        } else {
            System.out.println(-1);
        }
        return this.heap[this.counter];
    }

    public static void main(String[] args) {
        System.out.println("Heap");
        Stosy stosy = new Stosy(10);

        stosy.push(2);
        stosy.push(3);

        System.out.println(stosy.pop());
        System.out.println(stosy.pop());

    }
}
