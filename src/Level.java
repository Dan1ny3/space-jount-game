import java.util.ArrayList;
import java.util.List;

public class Level {
    private int difficulty;
    private List<Meteor> meteors;

    public Level() {
        meteors = new ArrayList<>();
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void addMeteor(Meteor meteor) {
        meteors.add(meteor);
    }

    public void displayLevelInfo() {
        System.out.println("Level Difficulty: " + difficulty);
        for (Meteor meteor : meteors) {
            meteor.showInfo();
        }
    }
}

class LevelBuilder {
    private Level level;

    public LevelBuilder() {
        level = new Level();
    }

    public LevelBuilder setDifficulty(int difficulty) {
        level.setDifficulty(difficulty);
        return this;
    }

    public LevelBuilder addMeteors(MeteorFactory factory, int count) {
        for (int i = 0; i < count; i++) {
            level.addMeteor(factory.createMeteor());
        }
        return this;
    }

    public Level build() {
        return level;
    }
}
