package com.directi.training.isp.solution.code;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, final ITimed door) {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask() {
            @Override
            public void run() {
                door.timeOutCallback();
            }
        }, timeOut);
    }
}
