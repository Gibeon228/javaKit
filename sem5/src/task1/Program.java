package task1;

public class Program {
    public static void main(String[] args) {

        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();

        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                try {
                    int value = objectA.getValue();
                    objectB.setValue(value);
                    System.out.println("Run1");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ;

            }
        };

        Runnable run2 = new Runnable() {
            @Override
            public void run() {
                try {
                    int value = objectB.getValue();
                    objectA.setValue(value);
                    System.out.println("Run2");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(objectB.value);
            }
        };

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
    }
}
