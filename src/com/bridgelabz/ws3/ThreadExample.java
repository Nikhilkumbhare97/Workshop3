package com.bridgelabz.ws3;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new Alphabet();
        thread.start();
//        Runnable runnable = new Number();

        Thread thread1 = new Thread(() -> {
            int i;
            for (i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });
        thread1.start();
    }
}
