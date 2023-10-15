public class Program {
    public static void main(String[] args) {

        SocketThreadListener serverButtonListener = new ServerButtonListenerImplementation();
        ServerSocketThreadListener serverSocketThreadListener = new ServerSocketThreadListenerImplemented();
        SocketThreadListener socketThreadListener = new SocketThreadListenerImplementation();
        ServerListener listener = new ServerListenerImplemented();
        ChatServer server = new ChatServer(listener, serverSocketThreadListener, serverButtonListener);
        new ServerWindow(socketThreadListener, server);
    }
}
