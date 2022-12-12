package Main;

import javafx.scene.control.Button;

public interface ButtonImage {
    String src = null;
    public ButtonImage changeImg(String src);
    public void displayOnButton(Button button);
}
