package org.example;

public class Taxi1 extends Car {
    private int price;

    public Taxi1(int no) {
        this(no, 0);
    }

    public Taxi1(int no, int price) {
        super(no);
        this.price = price;
    }

    public void start() {
        price = 420;
    }

    public void run() {
        price += 80;
    }

    public void display() {
        super.display();
        System.out.println("料金:" + price);
    }
}