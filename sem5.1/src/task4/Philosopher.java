package task4;


import java.util.Random;

public class Philosopher implements Runnable {
    private static boolean freeEat = true;
    private String name;

    private int indexEat = 0;
    private Random random = new Random();

    public Philosopher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        while (indexEat != 3) {
            if (freeEat) {
                freeEat = false;
                System.out.printf("%s: Philosopher eat\n", getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                indexEat++;
                freeEat = true;
                try {
                    Thread.sleep(random.nextInt(900));
                    System.out.printf("%s: Philosopher do think\n", getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.printf("%s: Philosopher do think\n", getName());
                try {
                    Thread.sleep(random.nextInt(900));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
