import java.util.ArrayList;

public final class ShiritoriGame implements Game{
    private ArrayList<String> words = new ArrayList<String>();
    private Boolean game_over = false;

    @Override
    public String printWords() {
        return String.join(", ", this.words);
    }
    @Override
    public String play(String word) {
        int n = this.words.size() - 1;
        if(n == -1){
            this.words.add(word);
            return this.printWords();
        }
        String last_word = words.get(n);

        String last_character = last_word.substring(last_word.length() - 1);
        String new_first_character = word.substring(0, 1);
        System.out.println(last_character);
        System.out.println(new_first_character);
        if(last_character != new_first_character || this.words.contains(word)) {
            this.game_over = true;
            return "game over";
        }
        else {
            this.words.add(word);
            return this.printWords();
        }
    }

    @Override
    public String restart() {
        this.words = new ArrayList<String>();
        this.game_over = false;
        return "game restarted";
    }
}
