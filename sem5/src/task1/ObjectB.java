package task1;

public class ObjectB {
    public int value = 10;


    public synchronized int getValue() throws InterruptedException {

        Thread.sleep(5000);
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
