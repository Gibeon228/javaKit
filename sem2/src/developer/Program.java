package developer;

import java.util.Arrays;
import java.util.List;


//Developer dev = new FrontendDeveloper();
//        if (dev instanceof Frontender) {
//        ((Frontender) dev).developGUI();


public class Program {
    public static void main(String[] args) {
        Developer max = new DeveloperFull();
        Developer igor = new DeveloperBack();
        Developer gena = new DeveloperFront();

        List<Developer> listBackDev = Arrays.asList(max, igor, gena);

        for (Developer developer : listBackDev) {
            if (developer instanceof DeveloperFront) {
                ((DeveloperFront) developer).developGUI();
            }

//        max.createFront();
//        max.createFront();
//        igor.createServer();
        }
    }
}

    class Developer {

    }

    class DeveloperFront extends Developer implements IFrontEnder {

        @Override
        public void createFront() {
            System.out.println("DeveloperFront сделал фронт");
        }

        public void developGUI() {
            System.out.println("Вызван метод developGUI"); // В задании, не изменяя интерфейсы, поэтому сделал это в классе, так можно засунуть метод в интерфейс
        }


    }


    interface IBackEnder {
        void createServer();
    }

    interface IFrontEnder {
        void createFront();
    }

    interface IFullStack extends IBackEnder, IFrontEnder {

    }

    class DeveloperFull extends Developer implements IFullStack {

        @Override
        public void createServer() {
            System.out.println("Сервер создан");
        }

        @Override
        public void createFront() {
            System.out.println("Сделан фронт");
        }
    }

    class DeveloperBack extends Developer implements IBackEnder {

        @Override
        public void createServer() {
            System.out.println("Уронил сервер");
        }
    }