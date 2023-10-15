import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {

    private final SocketThreadListener socketThreadListener;
    private final ChatServer chatServer;

    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_POSX = 700;
    private static final int WINDOW_POSY = 200;


    ServerWindow(SocketThreadListener socketThreadListener, ChatServer chatServer) {
        this.socketThreadListener = socketThreadListener;
        this.chatServer = chatServer;
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        JTextArea field = new JTextArea();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Server");
        setResizable(false);
        JPanel panBotton = new JPanel(new GridLayout(1, 1));
        panBotton.add(btnStart);
        panBotton.add(btnStop);
        add(panBotton, BorderLayout.CENTER);
        setVisible(true);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                socketThreadListener.pressBtn("btnStart");
                chatServer.startServer();
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                socketThreadListener.pressBtn("btnStop");
                chatServer.stopServer();
            }
        });

    }
}