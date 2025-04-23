/*
package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testGameInitialization() {
        Game game = new Game();
        assertNotNull(game, "Game instance should be created successfully.");
    }

    @Test
    void testGameScoreInitialization() {
        GameScore score = new GameScore();
        assertEquals(0, score.getScore(), "Initial score should be 0.");
    }
}

class SpaceshipTest {

    @Test
    void testSpaceshipMovement() {
        Spaceship spaceship = new Spaceship(100, 100);
        spaceship.moveUp();
        assertEquals(90, spaceship.getY(), "Spaceship should move up by 10 units.");
    }

    @Test
    void testSpaceshipPositionInitialization() {
        Spaceship spaceship = new Spaceship(50, 50);
        assertEquals(50, spaceship.getX(), "Initial X position should be 50.");
        assertEquals(50, spaceship.getY(), "Initial Y position should be 50.");
    }
}

class MeteorTest {

    @Test
    void testMeteorInitialization() {
        Meteor meteor = new Meteor(200, 300);
        assertNotNull(meteor, "Meteor instance should be created successfully.");
        assertEquals(200, meteor.getX(), "Meteor X position should be initialized correctly.");
        assertEquals(300, meteor.getY(), "Meteor Y position should be initialized correctly.");
    }

    @Test
    void testMeteorFall() {
        Meteor meteor = new Meteor(200, 300);
        meteor.fall();
        assertEquals(310, meteor.getY(), "Meteor should fall by 10 units.");
    }
}

class GameScoreTest {

    @Test
    void testScoreIncrement() {
        GameScore score = new GameScore();
        score.incrementScore(10);
        assertEquals(10, score.getScore(), "Score should be incremented by 10.");
    }

    @Test
    void testScoreReset() {
        GameScore score = new GameScore();
        score.incrementScore(10);
        score.resetScore();
        assertEquals(0, score.getScore(), "Score should be reset to 0.");
    }
}
*/