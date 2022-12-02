package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FieldsData implements DataBase{
    public List<String[]> data;
    private int items = 0;

    @Override
    public void addItem(String[] item) {
        this.data.add(item);
        this.items += 1;
    }

    public FieldsData(int properties_number){
        this.data = new ArrayList<String[]>();
    }

    public void shuffleItems(){
        Collections.shuffle(this.data);
    }
}
