package edu.up.cs301threadslab;

import android.util.Log;

public class AnimationThread implements Runnable {
    // Instance Var
    private AnimationView myAV;

    // Constructor
    public AnimationThread(AnimationView AV) {
        myAV = AV;
    }

    @Override
    public void run(){
        for(;;) {
            myAV.postInvalidate();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
