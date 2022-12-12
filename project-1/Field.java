package Main;


import javafx.scene.control.Button;
import javafx.scene.layout.*;


public class Field implements GameCard{
    private String img_src;
    private String hidden_img_src = "D:\\school\\sem_III\\Programowanie_obiektowe\\oop-put-course\\project-1\\memorygame\\src\\Main\\img\\Banana-Single.jpg";
    public Button bt = new Button();
    private MyImg img;
    private Boolean isVisible = false;
    private Boolean isDone = false;
    private String clas;
    private int id;

    @Override
    public void show() {
        this.img = new MyImg(this.img_src);
        this.img.displayOnButton(this.bt);
        this.isVisible = true;
    }
    @Override
    public void hide() {
        this.img = new MyImg(this.hidden_img_src);
        this.img.displayOnButton(this.bt);
        this.isVisible = false;
    }
    @Override
    public Boolean checkIfVisible() {return this.isVisible;}
    public void markAsDone(){this.isDone = true;}
    public Boolean checkIfDone(){return this.isDone;}
    public String clas(){return this.clas;}

    public Field(GridPane p,String cls, int i, int pos_x, int pos_y, String src){
        this.img_src = src;
        this.img = new MyImg(this.hidden_img_src);
        this.img.displayOnButton(this.bt);
        this.bt.setPrefSize(200, 200);
        GridPane.setConstraints(this.bt, pos_x, pos_y);
        p.getChildren().addAll(this.bt);
        this.clas = cls;
        this.id = i;
    }
}
