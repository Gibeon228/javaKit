public class ChatServer {
    public boolean serverStatus;
    private ServerListener listener;
    private final ServerSocketThreadListener serverSocketThreadListener;
    private final SocketThreadListener socketThreadListener;


    public ChatServer(ServerListener listener, ServerSocketThreadListener serverSocketThreadListener, SocketThreadListener socketThreadListener) {
        this.serverSocketThreadListener = serverSocketThreadListener;
        this.socketThreadListener = socketThreadListener;
        serverStatus = false;
        this.listener = listener;
    }

    public void startServer() {
        socketThreadListener.pressBtn("btnStart");
        if (serverStatus) {
            listener.onMessageRecived("Server already started");
        } else {
            serverSocketThreadListener.onStart();
            listener.onMessageRecived("Server started!!");
            serverStatus = true;
        }
    }

    public void stopServer() {
        socketThreadListener.pressBtn("btnStop");
        if (serverStatus) {
            listener.onMessageRecived("Server off!");
            serverSocketThreadListener.onStop();
            serverStatus = false;
        } else {
            listener.onMessageRecived("Server already off!");
        }
    }
}

interface ServerListener {
    void onMessageRecived(String message);
}
