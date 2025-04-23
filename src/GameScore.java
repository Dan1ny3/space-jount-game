public class GameScore {
    private static GameScore instance;
    private int score;

    private GameScore() {
        this.score = 0;
    }

    public static GameScore getInstance() {
        if (instance == null) {
            instance = new GameScore();
        }
        return instance;
    }

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}
