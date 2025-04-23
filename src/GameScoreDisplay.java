// Observator concret
public class GameScoreDisplay implements ScoreObserver {
    @Override
    public void update(int points) {
        System.out.println("Scorul actualizat: " + points);
    }
}