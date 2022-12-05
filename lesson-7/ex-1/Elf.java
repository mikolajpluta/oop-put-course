import java.util.*;

public class Elf {
    private List<Integer> calories = new ArrayList<Integer>();

    public void add_calories(int x){
        this.calories.add(x);
    }
    public int check_calories_sum(){
        int sum = 0;
        for(int i=0; i < this.calories.size(); i++){
            sum += this.calories.get(i);
        }
        return sum;
    }
    public Elf(){;};

}
