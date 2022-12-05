import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{

        File file = new File("D:\\school\\sem_III\\Programowanie_obiektowe\\oop-put-course\\lesson-7\\ex-1\\src\\data\\Day01.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int max = 0;

        List<Elf> elfs = new ArrayList<Elf>();
        elfs.add(new Elf());

        while ((st = br.readLine()) != null){
            if(st.length() > 0){
                int last = elfs.size() - 1;
                elfs.get(last).add_calories(Integer.parseInt(st));
            }else{
                elfs.add(new Elf());
            }
        }

        for(int i=0; i<elfs.size(); i++){
            int current_value = elfs.get(i).check_calories_sum();
            if(current_value > max) max = current_value;
        }

        System.out.println(max);

    }
}