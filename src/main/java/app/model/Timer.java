package app.model;

public class Timer {

    private long nanoTime = System.nanoTime();

    public long getTime() {
        return nanoTime;
    }
}
