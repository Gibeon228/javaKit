import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
//        InputStream is = new DataInputStream(new FileInputStream("test.txt"));
//        FirstClass<String, DataInputStream, Integer> fc = new FirstClass<>("any", new DataInputStream(is), 3);
//        fc.getNamesClass();

//
//        ParamCollection<Double> paramCollection = new ParamCollection<>(new Double[10]);
//        paramCollection.add(2.0);
//        paramCollection.add(1.0);
//        paramCollection.add(3.0);
//        paramCollection.add(2.0);
//        paramCollection.add(1.0);
//        paramCollection.add(3.0);
//        for (Double aDouble : paramCollection) {
//            System.out.println(aDouble);
//        }


        Person person1 = new HardWorker();
        Person person2 = new HardWorker();
        Person person3 = new HardWorker();
        Person person4 = new HardWorker();
        Person person5 = new HardWorker();
        Person person6 = new Idler();
        Person person7 = new Idler();
        Person person8 = new Idler();
        Person person9 = new Idler();
        Person person10 = new Idler();

        Person[] workers = {person1, person7, person3, person9, person5};
        Person[] idlers = {person6, person2, person8, person4, person10};

        WorkPlace<? extends Person> factory = new WorkPlace<>(workers);
//        NightClub<? extends Person> club = new NightClub<>(idlers);
//
//        factory.workForAll();
//        club.partyForAll();

        for (Person worker : workers) {
            System.out.println(worker);
        }

    }
}
