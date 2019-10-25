package client2;
import javax.swing.JFrame;

public class ClientTest {
    public static void main(String[] args) {
        Client2 sammy;
        sammy = new Client2("127.0.0.1");
        sammy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sammy.startRunning();
    }
    
}
