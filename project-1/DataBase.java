package Main;

import java.util.List;

public interface DataBase {
    List<String[]> data = null;
    int items = 0;
    public void addItem(String[] item);
}
