package Main;

import javafx.scene.control.Button;

public class Card implements GameCard{
    private String img_src;
    private String hidden_img_src = "D:\\school\\sem_III\\Programowanie_obiektowe\\oop-put-course\\project-1\\memorygame\\src\\Main\\img\\Banana-Single.jpg";
    private MyImg img;
    private Boolean is_visible = false;
    private String cls;

    public Card(String c, String src){
        this.img_src = src;
        this.img = new MyImg(hidden_img_src);
        this.cls = c;
    }

    public void assignToButton(Button button){this.img.displayOnButton(button);}

    @Override
    public String showClass() {
        return this.cls;
    }
    @Override
    public void flip() {
        if(this.is_visible) this.img = new MyImg(this.hidden_img_src);
        else this.img = new MyImg(this.img_src);
        this.is_visible = !this.is_visible;
    }
    @Override
    public Boolean checkIfVisible() {return this.is_visible;}
}
