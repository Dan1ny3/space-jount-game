
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    private Timer timer;
    private Spaceship spaceship;
    private ArrayList<Meteor> meteors;
    private int score;
    private int timeLeft = 60; // Joc de 1 minut

    public GamePanel() {
        setFocusable(true);
        spaceship = new Spaceship();
        meteors = new ArrayList<>();
        score = 0;

        // Timer pentru joc
        timer = new Timer(30, this); // 30ms pentru animație
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                spaceship.move(e);
            }
        });
    }

    public void startGame() {
        new GameTimer().start();
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        spaceship.update();
        spawnMeteors();
        updateMeteors();
        checkCollisions();
        repaint();
    }

    private void spawnMeteors() {
        Random rand = new Random();
        if (rand.nextInt(20) == 0) { // Probabilitate de apariție
            meteors.add(new Meteor(800, rand.nextInt(500) + 50));
        }
    }

    private void updateMeteors() {
        for (Meteor m : meteors) {
            m.update();
        }
    }

    private void checkCollisions() {
        for (int i = 0; i < meteors.size(); i++) {
            Meteor m = meteors.get(i);
            if (spaceship.getBounds().intersects(m.getBounds())) {
                int meteorValue = m.getValue();
                int spaceshipTen = spaceship.getTen();
                if (meteorValue / 10 == spaceshipTen) {
                    spaceship.increaseSpeed();
                } else {
                    spaceship.decreaseSpeed();
                }
                meteors.remove(i);
                score += 10;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBackground(g);
        spaceship.draw(g);
        for (Meteor m : meteors) {
            m.draw(g);
        }
        drawHUD(g);
    }

    private void drawBackground(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    private void drawHUD(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 10, 20);
        g.drawString("Time Left: " + timeLeft, 10, 40);
    }

    class GameTimer extends Thread {
        @Override
        public void run() {
            while (timeLeft > 0) {
                try {
                    Thread.sleep(1000);
                    timeLeft--;
                    if (timeLeft == 0) {
                        timer.stop();
                        JOptionPane.showMessageDialog(null, "Game Over! Score: " + score);
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
