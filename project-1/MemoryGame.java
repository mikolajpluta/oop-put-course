package Main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoryGame implements EventHandler<ActionEvent> {
    private Stage window;
    private GridPane grid = new GridPane();
    private Scene scene;

    private List<Field> visible = new ArrayList<Field>();
    private int done = 0;
    private Field[] fields = new Field[16];
    private List<String[]> data = new ArrayList<String[]>();

    private void windowSetup(){
        this.window.setTitle("memory game");
        this.grid.setPadding(new Insets(10, 10, 10, 10));
        this.grid.setVgap(10);
        this.grid.setHgap(10);
        scene = new Scene(this.grid, 820, 820);
        this.window.setScene(scene);
        this.window.show();
    }
    public void startNewGame(){
        int nr = 0;
        Collections.shuffle(this.data);
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                this.fields[nr] = new Field(this.grid, this.data.get(nr)[0], nr, i, j, this.data.get(nr)[1]);
                this.fields[nr].bt.setOnAction(this);
                nr++;
            }
        }
    }
    public MemoryGame(Stage s, List<String[]> d){
        this.window = s;
        this.data = d;
        this.windowSetup();
    }
    // handles every click
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
                    this.startNewGame();
                    this.done = 0;
                }
            }
        }
    }

}
