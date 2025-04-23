
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Meteor {
    private int x, y, speed, value;
    private Image image;

    public Meteor(int startX, int startY) {
        x = startX;
        y = startY;
        speed = 2;
        Random rand = new Random();
        value = rand.nextInt(90) + 10; // Valori între 10 și 99
        image = new ImageIcon("C:\\Users\\Danut\\Documents\\NetBeansProjects\\Game\\src\\meteor.png").getImage();
    }

    public void update() {
        x -= speed;
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, 50, 50, null);
        g.setColor(Color.GREEN);
        g.drawString(Integer.toString(value), x + 20, y + 25);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 50, 50);
    }

    public int getValue() {
        return value;
    }

    void showInfo() {
        
    }
}
