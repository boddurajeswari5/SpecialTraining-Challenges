import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class BillsAmongPeople{
    public static void main(String[] args) {
        List<Bil> bills=new ArrayList<>();
        LinkedHashMap<String,Integer> balances=new LinkedHashMap<>();
        balances.put("Anand",0);
        balances.put("Balaji",0);
        balances.put("Chaithanya",0);
        balances.put("Divya",0);
        bills.add(new Bil("Lunch",2000,"Balaji",Arrays.asList("Anand","Balaji","Chaithanya","Divya")));
        bills.add(new Bil("Movie Ticket",1000,"Anand",Arrays.asList("Anand","Balaji","Chaithanya","Divya")));
        bills.add(new Bil("Snacks",750,"Chaithanya",Arrays.asList("Anand","Balaji","Chaithanya")));

        
        for(Bil bill:bills){
            int totalAmount=bill.getAmount();
            String paidby=bill.getPaidby();
            List<String> sharedby=bill.getSharedBy();
            int sharePerPerson=totalAmount/sharedby.size();

            for(String person:sharedby)
            {
                balances.put(person,sharePerPerson+balances.get(person));
            }
            balances.put(paidby,balances.get(paidby)-totalAmount);
        }
        
        //printing balances
        for(Entry<String, Integer> entry:balances.entrySet()){
            String person = entry.getKey();
            int balance= entry.getValue();
            System.out.println(person+" owes "+(balance)+ " to Others.");
        }

    }
}
class Bil{
    private String data;
    private int amount;
    private String paidby;
    private List<String> sharedby;
    Bil(String data,int amount,String paidby,List<String> sharedby){
        this.data=data;
        this.amount=amount;
        this.paidby=paidby;
        this.sharedby=sharedby;
    }
    public String getData(){
        return this.data;
    }

    public int getAmount(){
        return this.amount;
    }

    public String getPaidby(){
        return this.paidby;
    }

    public List<String> getSharedBy(){
        return this.sharedby;
    }
}


