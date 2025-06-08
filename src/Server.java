import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;

public class Server extends JFrame {

    public Server() {
        setTitle("Server Management");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1120, 625);
        setResizable(false);
        setLayout(null); // Set the layout to null

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(0, 0, 1120, 625); // Set the bounds of the tabbed pane

        // --------------------------------------------- //

        JPanel mainPage = new JPanel();
        mainPage.setLayout(null); // Set the layout to null
        mainPage.setBounds(0, 0, 1120, 625); // Set the bounds of the main page

        JLabel mainLabel1 = new JLabel("Server status:");
        mainLabel1.setBounds(400, 100, 400, 50);
        mainLabel1.setFont(new Font("Serif", Font.BOLD, 45));
        mainPage.add(mainLabel1);

        JButton startButton = new JButton("Start server");
        startButton.setBounds(450, 250, 200, 50);
        mainPage.add(startButton);

        JButton stopButton = new JButton("Stop server");
        stopButton.setBounds(450, 350, 200, 50);
        mainPage.add(stopButton);

        JLabel statusServer = new JLabel("OFF");
        statusServer.setBounds(675, 100, 400, 50);
        statusServer.setFont(new Font("Serif", Font.BOLD, 45));
        mainPage.add(statusServer);

        startButton.addActionListener(e -> {
            statusServer.setText("ON");
            startServer();
        });

        stopButton.addActionListener(e -> {
            statusServer.setText("OFF");
        });

        // --------------------------------------------- //

        JPanel securityPage = new JPanel();
        securityPage.setLayout(null); // Set the layout to null
        securityPage.setBounds(0, 0, 1120, 625); // Set the bounds of the security page

        JLabel securityLabel = new JLabel("Current cert");
        securityLabel.setBounds(400, 0, 400, 50);
        securityLabel.setFont(new Font("Serif", Font.BOLD, 45));
        securityPage.add(securityLabel);

        JTextArea certTextArea = new JTextArea();
        certTextArea.setBounds(325, 75, 400, 250);
        securityPage.add(certTextArea);

        JButton generateButton = new JButton("Generate");
        generateButton.setBounds(325, 330, 175, 45);
        securityPage.add(generateButton);

        JButton destroyButton = new JButton("Destroy");
        destroyButton.setBounds(550, 330, 175, 45);
        securityPage.add(destroyButton);

        JLabel usingLabel = new JLabel("Using cert: ");
        usingLabel.setBounds(480, 375, 175, 45);
        usingLabel.setFont(new Font("Serif", Font.BOLD, 20));
        securityPage.add(usingLabel);

        JButton useButton = new JButton("Use");
        useButton.setBounds(400, 410, 100, 25);
        securityPage.add(useButton);
        JButton dismissButton = new JButton("Dismiss");
        dismissButton.setBounds(550, 410, 100, 25);
        securityPage.add(dismissButton);

        // --------------------------------------------- //
        JPanel gestPart = new JPanel();
        gestPart.setLayout(null); // Set the layout to null
        gestPart.setBounds(0, 0, 1120, 625); // Set the bounds of the gestPart page

        JLabel gestPartLabel = new JLabel("Party management");
        gestPartLabel.setBounds(450, 250, 200, 50);
        gestPart.add(gestPartLabel);

        // --------------------------------------------- //
        JPanel gestVote = new JPanel();
        gestVote.setLayout(null); // Set the layout to null
        gestVote.setBounds(0, 0, 1120, 625); // Set the bounds of the gestVote page

        JLabel gestVoteLabel = new JLabel("Votes management");
        gestVoteLabel.setBounds(450, 250, 200, 50);
        gestVote.add(gestVoteLabel);

        // --------------------------------------------- //

        tabbedPane.add("Server status", mainPage);
        tabbedPane.add("Security options", securityPage);
        tabbedPane.add("Party management", gestPart);
        tabbedPane.add("Votes management", gestVote);

        add(tabbedPane);
        setVisible(true);
    }

    public void startServer() {
        try {
            ServerSocket server = new ServerSocket(49151);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Server::new);
    }
}