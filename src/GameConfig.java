
public class GameConfig {
    private static GameConfig instance;

    private GameConfig() {
        // Constructor privat
    }

    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    public void loadConfig() {
        System.out.println("Configurațiile au fost încărcate.");
    }
}
