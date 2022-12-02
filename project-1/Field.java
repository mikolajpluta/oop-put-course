package Main;

//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.List;

public class Field implements EventHandler<ActionEvent> {

    Button bt;
    private Image img;
    private ImageView field;
    private int[] position;
    private Boolean hidden;

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("tez dziala");
    }
    public Field(String text){
        this.bt.setOnAction(this);
        this.bt = new Button();
    }
}
