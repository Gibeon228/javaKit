public class ServerButtonListenerImplementation implements SocketThreadListener {
    @Override
    public void pressBtn(String btnName) {
        System.out.println("Server logg: command received " + btnName);
    }
}

