public class SocketThreadListenerImplementation implements SocketThreadListener {
    @Override
    public void pressBtn(String btnName) {
        System.out.println("Client logg: pressed button" + btnName);
    }
}
