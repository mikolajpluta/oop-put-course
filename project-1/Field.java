package Main;

import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class Field implements UsableField{
    public Button bt = null;
    private Card card;
    private Boolean isDone = false;
    private int id = 0;

    @Override
    public Boolean checkIfDone() {return this.isDone;}
    public Boolean isCardVisible(){return this.card.checkIfVisible();}
    public void markAsDone(){this.isDone = true;}
    public String cardClass(){return this.card.showClass();}
    public void flipCard(){
        this.card.flip();
        this.card.assignToButton(this.bt);
    }
    public Field(GridPane p,String cls, int i, int pos_x, int pos_y, String src){
        this.bt = new Button();
        this.card = new Card(cls, src);
        this.card.assignToButton(this.bt);
        this.bt.setPrefSize(200, 200);
        GridPane.setConstraints(this.bt, pos_x, pos_y);
        p.getChildren().addAll(this.bt);
        this.id = i;
    }
}
