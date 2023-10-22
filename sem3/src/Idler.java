public class Idler implements Person {
    @Override
    public void doWork() {
        System.out.println("I don't know!");
    }

    @Override
    public void haveRest() {
        System.out.println("Party hard!");
    }
}
