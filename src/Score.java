import java.util.ArrayList;
import java.util.List;

// Subiectul (Scorul jocului)
public class Score {
    private int points = 0;
    private List<ScoreObserver> observers = new ArrayList<>();

    public void addObserver(ScoreObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ScoreObserver observer) {
        observers.remove(observer);
    }

    public void setPoints(int points) {
        this.points = points;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ScoreObserver observer : observers) {
            observer.update(points);
        }
    }
}

// Interfața Observer
interface ScoreObserver {
    void update(int points);
}



