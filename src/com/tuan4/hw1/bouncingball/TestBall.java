package com.tuan4.hw1.bouncingball;

public class TestBall {

    public static void main(String[] args) {

        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);

        for (int step = 1; step <= 100; ++step) {
            if (box.collides(ball)) {
                System.out.println("Collided with box.");
            }
            ball.move();
            System.out.println(step + ": " + ball);
        }
    }
}
