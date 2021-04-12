package com.bridgelabz.ws3;

import static java.lang.Thread.sleep;

public class Number implements Runnable {
    @Override
    public void run() {
        int i;
        for (i = 1; i <= 100; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
