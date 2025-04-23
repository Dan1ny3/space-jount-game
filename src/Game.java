import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        // Creare fereastră principală
        JFrame frame = new JFrame("Space Jaunt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        
        // Adăugare panou de joc
        GamePanel panel = new GamePanel();
        frame.add(panel);
        frame.setVisible(true);

        // Pornirea jocului
        panel.startGame();
    }
}
