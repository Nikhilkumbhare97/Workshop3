package com.bridgelabz.ws3;

public class Alphabet extends Thread {

    public void run() {
        char ch;
        for (ch = 'a'; ch <= 'z'; ch++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ch);
        }
    }
}
