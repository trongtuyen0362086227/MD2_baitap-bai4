package jav.abc;

import java.util.Date;

public class Stopwatch {
    private long starTime;
    private long endTime;

    public Stopwatch() {

    }

    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start(){
        this.starTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-starTime;
    }
}
