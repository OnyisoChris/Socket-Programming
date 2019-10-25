import javax.swing.JFrame;

public class ServerTest {
    public static void main(String[] args){
        Server2 sally = new Server2();
        sally.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sally.startRunning();
    }
}
