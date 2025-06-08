import javax.swing.*;
import java.awt.*;

public class Client extends JFrame {

    public Client() {
        setTitle("Client");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1120, 625);
        setResizable(false);
        setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(0, 0, 1120, 625);

        JPanel mainPage = new JPanel();
        mainPage.setLayout(null);
        mainPage.setBounds(0, 0, 1120, 625);

        JLabel mainLabel1 = new JLabel("Vote party");
        mainLabel1.setBounds(400, 100, 400, 50);
        mainLabel1.setFont(new Font("Serif", Font.BOLD, 45));
        mainPage.add(mainLabel1);

        JPanel securityPage = new JPanel();
        securityPage.setLayout(null);
        securityPage.setBounds(0, 0, 1120, 625);

        tabbedPane.add("Vote", mainPage);
        tabbedPane.add("Config", securityPage);

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Client());
    }
}
