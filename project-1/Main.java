package Main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.List;

public class Main extends Application{

     public Stage window;
     public GridPane grid;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("memory game");

        grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);


        Image img = new Image("E:\\project-1\\memorygame\\src\\Main\\img\\Banana-Single.jpg");
        ImageView view = new ImageView(img);
        Image img2 = new Image("E:\\project-1\\memorygame\\src\\Main\\img\\Banana-Single.jpg");
        ImageView view2 = new ImageView(img);
        //Setting the position of the image

        BackgroundSize s = new BackgroundSize(500,500, false, false, true, true);
        BackgroundImage bi = new BackgroundImage(img, null, null, null, s);


        Background b = new Background(bi);

        Button bt = new Button();
        bt.setBackground(b);
        bt.setPrefSize(500, 500);

        GridPane.setConstraints(bt, 0, 0);

        System.out.println(bi.getSize());

        grid.getChildren().addAll(bt);


        Scene scene = new Scene(grid, 1000, 1000);

        window.setScene(scene);


        window.show();





    }
}