public class Main {
    public static void main(String[] args) {
        ShiritoriGame game = new ShiritoriGame();
        System.out.println(game.play("dog"));
        System.out.println(game.play("god"));
        System.out.println(game.play("doom"));
        System.out.println(game.play("keyboard"));
        System.out.println(game.restart());
        System.out.println(game.play("screen"));
        System.out.println(game.play("nose"));
        System.out.println(game.play("screen"));
    }
}