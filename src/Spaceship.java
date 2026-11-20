
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Spaceship {
    private int x, y, speed, ten;
    private Image image;

    public Spaceship() {
        x = 50;
        y = 250;
        speed = 5;
        ten = 5; // Inițial cifra pentru verificare
        image = new ImageIcon(getClass().getResource("/spaceship.png")).getImage();
    }

    public void move(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) y -= speed;
        if (e.getKeyCode() == KeyEvent.VK_DOWN) y += speed;
    }

    public void update() {
        // Limite pentru mișcare
        if (y < 0) y = 0;
        if (y > 550) y = 550;
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, 50, 50, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 50, 50);
    }

    public int getTen() {
        return ten;
    }

    public void increaseSpeed() {
        speed += 2;
    }

    public void decreaseSpeed() {
        speed = Math.max(2, speed - 2);
    }
}
