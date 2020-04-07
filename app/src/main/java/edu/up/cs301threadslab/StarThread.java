package edu.up.cs301threadslab;

import java.util.Random;

public class StarThread implements Runnable {
    // Instance Variables
    private Random rand = new Random();
    private StarAnimation reference;

    public StarThread(StarAnimation starAnimation) {
        reference = starAnimation;
    }

    @Override
    public void run(){
        for(;;) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            reference.progressChange(rand.nextInt(999));
        }
    }
}
