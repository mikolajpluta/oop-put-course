package Main;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application{
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage stage) throws Exception {
        //storing fields data
        List<String[]> imgData = new ArrayList<String[]>();
        for (int i = 0; i < 2; i++) {
            imgData.add(new String[]{"one", "D:/school/project-1/memorygame/src/Main/img/img1.png"});
            imgData.add(new String[]{"two", "D:/school/project-1/memorygame/src/Main/img/img2.png"});
            imgData.add(new String[]{"three", "D:/school/project-1/memorygame/src/Main/img/img3.png"});
            imgData.add(new String[]{"four", "D:/school/project-1/memorygame/src/Main/img/img4.png"});
            imgData.add(new String[]{"five", "D:/school/project-1/memorygame/src/Main/img/img5.png"});
            imgData.add(new String[]{"six", "D:/school/project-1/memorygame/src/Main/img/img6.png"});
            imgData.add(new String[]{"seven", "D:/school/project-1/memorygame/src/Main/img/img7.png"});
            imgData.add(new String[]{"eight", "D:/school/project-1/memorygame/src/Main/img/img8.png"});
        }

        MemoryGame game = new MemoryGame(stage, imgData);
        game.startNewGame();
    }
}