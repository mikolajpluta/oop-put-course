import java.util.ArrayList;

public interface Game {
    ArrayList<String> words = null;
    Boolean game_over = null;

    public String play(String word);
    public String restart();
    public String printWords();
}
