package task4;

//Есть пять философов (потоки), которые могут либо обедать либо размышлять.
//        Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
//        После каждого приема пищи философ должен размышлять
//        Не должно возникнуть общей блокировки
//        Философы не должны есть больше одного раза подряд

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Runnable philosopher1 = new Philosopher("philosopher1");
        Runnable philosopher2 = new Philosopher("philosopher2");
        Runnable philosopher3 = new Philosopher("philosopher3");
        Runnable philosopher4 = new Philosopher("philosopher4");
        Runnable philosopher5 = new Philosopher("philosopher5");
        Thread thread1 = new Thread(philosopher1);
        Thread thread2 = new Thread(philosopher2);
        Thread thread3 = new Thread(philosopher3);
        Thread thread4 = new Thread(philosopher4);
        Thread thread5 = new Thread(philosopher5);
        List<Thread> threads = new ArrayList<>();
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
