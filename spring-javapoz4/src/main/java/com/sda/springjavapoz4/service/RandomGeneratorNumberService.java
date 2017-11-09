package com.sda.springjavapoz4.service;

import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
public class RandomGeneratorNumberService implements NumberGenerator{

private Random random = new Random();
private int bound;
private int offset;

    public RandomGeneratorNumberService(int bound, int offset) {
        this.random = new Random();
        this.bound = bound;
        this.offset = offset;
    }

    public int generateNumber(){
        int randomValue = random.nextInt(bound) + offset;
        System.out.println(randomValue);
        return randomValue;

    }

    public RandomGeneratorNumberService(int bound) {
        this(bound,0);
    }

    public RandomGeneratorNumberService() {
        this(100,0);
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
