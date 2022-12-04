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
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.List;

public class Field{

    public Button bt = new Button();
    private String img_src;
    private String hidden_img_src = "D:\\school\\sem_III\\Programowanie_obiektowe\\oop-put-course\\project-1\\memorygame\\src\\Main\\img\\Banana-Single.jpg";
    private Image img = new Image(this.hidden_img_src);
    private BackgroundSize s = new BackgroundSize(200, 200, false, false, true, true);
    private BackgroundImage bg_img = new BackgroundImage(this.img, null, null, null, this.s);
    private Background bg = new Background(this.bg_img);
    private Boolean isVisible = false;
    private Boolean isDone = false;

    private String clas;
    private int id;

    public void update(){
        this.bg_img = new BackgroundImage(this.img, null, null, null, this.s);
        this.bg = new Background(this.bg_img);
        this.bt.setBackground(this.bg);
    }
    public void show(){
        this.img = new Image(this.img_src);
        this.isVisible = true;
        this.update();
    }
    public void hide(){
        this.img = new Image(this.hidden_img_src);
        this.isVisible = false;
        this.update();
    }

    public void markAsDone(){this.isDone = true;}
    public Boolean checkIfDone(){return this.isDone;}
    public void markAsVisible(){this.isVisible = true;}
    public Boolean checkIfVisible(){return this.isVisible;}
    public String clas(){return this.clas;}

    public Field(GridPane p,String cls, int i, int pos_x, int pos_y, String src){
        this.bt.setBackground(this.bg);
        this.bt.setPrefSize(200, 200);
        GridPane.setConstraints(this.bt, pos_x, pos_y);
        p.getChildren().addAll(this.bt);
        this.img_src = src;
        this.clas = cls;
        this.id = i;
    }
}
