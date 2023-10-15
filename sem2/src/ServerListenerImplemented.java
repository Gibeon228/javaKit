public class ServerListenerImplemented implements ServerListener{
    @Override
    public void onMessageRecived(String message) {
        System.out.println("Message: " + message);
    }
}
