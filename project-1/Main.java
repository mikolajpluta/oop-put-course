package Main;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main extends Application implements EventHandler<ActionEvent>{

     public Stage window;
     public GridPane grid;
     public List<Field> visible = new ArrayList<Field>();
     public int done = 0;
     public Field[] fields = new Field[16];

    public static void main(String[] args) {
        launch(args);
    }

    public List<String[]> data = new ArrayList<String[]>();

    @Override
    public void start(Stage stage) throws Exception {
        //window setup
        window = stage;
        window.setTitle("memory game");
        grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);
        Scene scene = new Scene(grid, 820, 820);
        window.setScene(scene);
        window.show();

        //storing fields data
        for(int i=0; i<2; i++) {
            data.add(new String[]{"one", "D:/school/sem_III/Programowanie_obiektowe/oop-put-course/project-1/memorygame/src/Main/img/img1.png"});
            data.add(new String[]{"two", "D:/school/sem_III/Programowanie_obiektowe/oop-put-course/project-1/memorygame/src/Main/img/img2.png"});
            data.add(new String[]{"three", "D:/school/sem_III/Programowanie_obiektowe/oop-put-course/project-1/memorygame/src/Main/img/img3.png"});
            data.add(new String[]{"four", "D:/school/sem_III/Programowanie_obiektowe/oop-put-course/project-1/memorygame/src/Main/img/img4.png"});
            data.add(new String[]{"five", "D:/school/sem_III/Programowanie_obiektowe/oop-put-course/project-1/memorygame/src/Main/img/img5.png"});
            data.add(new String[]{"six", "D:/school/sem_III/Programowanie_obiektowe/oop-put-course/project-1/memorygame/src/Main/img/img6.png"});
            data.add(new String[]{"seven", "D:/school/sem_III/Programowanie_obiektowe/oop-put-course/project-1/memorygame/src/Main/img/img7.png"});
            data.add(new String[]{"eight", "D:/school/sem_III/Programowanie_obiektowe/oop-put-course/project-1/memorygame/src/Main/img/img8.png"});
        }
        int nr = 0;
        //shuffling fields
        Collections.shuffle(data);
        //generating new fields
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                fields[nr] = new Field(grid, data.get(nr)[0], nr, i, j, data.get(nr)[1]);
                fields[nr].bt.setOnAction(this);
                nr++;
            }
        }
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        for(int i=0; i<16; i++){
            if(actionEvent.getSource()==this.fields[i].bt){

                //game logic
                if(this.done < 16){
                    if(this.visible.size() < 2){
                        if(!this.fields[i].checkIfDone()){
                            if(!this.fields[i].isCardVisible()){
                                this.fields[i].flipCard();
                                this.visible.add(fields[i]);
                            }
                        }
                    }else{
                        if(this.visible.get(0).cardClass() == this.visible.get(1).cardClass()){
                            this.visible.get(0).markAsDone();
                            this.visible.get(1).markAsDone();
                            this.done += 2;
                        }else{
                            this.visible.get(0).flipCard();
                            this.visible.get(1).flipCard();
                        }
                        this.visible = new ArrayList<Field>();
                    }
                }else{
                    int nr = 0;
                    //shuffling fields
                    Collections.shuffle(this.data);
                    //generating new fields
                    for(int k=0; k<4; k++){
                        for(int j=0; j<4; j++){
                            fields[nr] = new Field(grid, data.get(nr)[0], nr, k, j, data.get(nr)[1]);
                            fields[nr].bt.setOnAction(this);
                            nr++;
                        }
                    this.done = 0;
                    }
                }
            }
        }
    }
}