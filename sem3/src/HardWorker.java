public class HardWorker implements Person{
    @Override
    public void doWork() {
        System.out.println("Working hard!");
    }

    @Override
    public void haveRest() {
        System.out.println("I don't know!");
    }
}
