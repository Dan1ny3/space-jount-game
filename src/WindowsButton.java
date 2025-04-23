
import javax.swing.*;
import java.awt.*;

public class WindowsButton{
    public void render() {
        JFrame frame = new JFrame("Space Jaunt");
        JButton button = new JButton("Start Game");
        button.setBounds(100, 100, 150, 40);

        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        // Adăugăm o acțiune la apăsarea butonului
        button.addActionListener(e -> System.out.println("Game Started!"));
    }
}
