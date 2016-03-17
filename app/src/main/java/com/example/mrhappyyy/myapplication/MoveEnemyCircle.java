package com.example.mrhappyyy.myapplication;

public class MoveEnemyCircle extends Thread {
    EnemyCircle circle;

    public MoveEnemyCircle(EnemyCircle circle) {
        this.circle = circle;
        this.start();
    }

    @Override
    public void run() {
        super.run();
        move();

    }

    private void move() {
        for (int i = 0; i < 1000000; i++) {
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            circle.moveOneStep();
        }
    }
}
