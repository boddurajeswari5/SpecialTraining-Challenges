import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Score_of_Students {
    public static void main(String[] args) {
        Map<Integer,List<Integer>> students=new HashMap<>();
        Map<Integer,Integer> total_scr=new HashMap<>();
        Map<Integer,Double> Avg_scr=new HashMap<>();
        students.put(1, Arrays.asList(10,20,10));
        students.put(2, Arrays.asList(10,20,11));

        for(Entry<Integer, List<Integer>> entry : students.entrySet()){
            List<Integer> values=entry.getValue();
            int sum=values.stream().mapToInt(s->s).sum();
            total_scr.put(entry.getKey(),sum);
            double avg=(double)sum/entry.getValue().size();
            Avg_scr.put(entry.getKey(),avg);
        }

        System.out.print("Student_id and their Score : ");
        System.out.println(students+"\n");

        System.out.print("Total Score : ");
        System.out.println(total_scr);

        System.out.print("Average Score : ");
        System.out.println(Avg_scr);
    }
}
