package Main;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;

public class MyImg implements ButtonImage{
    private String img_src;
    private Image img;
    private BackgroundSize s = new BackgroundSize(200, 200, false, false, true, true);
    private BackgroundImage bg_img;
    private Background bg;

    public MyImg(String src){
        this.img_src = src;
        this.img = new Image(this.img_src);
        this.bg_img = new BackgroundImage(this.img, null, null, null, this.s);
        this.bg = new Background(this.bg_img);
    }

    @Override
    public MyImg changeImg(String src) {return new MyImg(src);}
    @Override
    public void displayOnButton(Button button) {button.setBackground(this.bg);}
}
