import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Passengers_By_Age {
    public static void main(String[] args) {
        ArrayList<Passengers> passenger_details=new ArrayList<>();
        passenger_details.add(new Passengers("John", 5));
        passenger_details.add(new Passengers("Doe", 55));
        passenger_details.add(new Passengers("Tim", 40));
        passenger_details.add(new Passengers("Max", 19));
        List<Passengers> age_0_10=passenger_details.stream().filter(psngr->psngr.getAge()>=0 && psngr.getAge()<10).collect(Collectors.toList());
        List<Passengers> age_10_20=passenger_details.stream().filter(psngr->psngr.getAge()>=10 && psngr.getAge()<20).collect(Collectors.toList());
        List<Passengers> age_20_30=passenger_details.stream().filter(psngr->psngr.getAge()>=20 && psngr.getAge()<30).collect(Collectors.toList());
        List<Passengers> age_30_40=passenger_details.stream().filter(psngr->psngr.getAge()>=30 && psngr.getAge()<40).collect(Collectors.toList());
        List<Passengers> age_40_50=passenger_details.stream().filter(psngr->psngr.getAge()>=40 && psngr.getAge()<50).collect(Collectors.toList());
        List<Passengers> age_ab_50=passenger_details.stream().filter(psngr->psngr.getAge()>=50).collect(Collectors.toList());
        System.out.print("Passengers whose age between 0 to 10 : " ); mtOrNt(age_0_10);
        System.out.print("Passengers whose age between 10 to 20 : " ); mtOrNt(age_10_20);
        System.out.print("Passengers whose age between 20 to 30 : " ); mtOrNt(age_20_30);
        System.out.print("Passengers whose age between 30 to 40 : " ); mtOrNt(age_30_40);
        System.out.print("Passengers whose age between 40 to 50 : " ); mtOrNt(age_40_50);
        System.out.print("Passengers whose age above 50 : " ); mtOrNt(age_ab_50);


        //Count the number of passengers
        int c1= (int) age_0_10.stream().count();
        int c2= (int) age_10_20.stream().count();
        int c3= (int) age_20_30.stream().count();
        int c4= (int) age_30_40.stream().count();
        int c5= (int) age_40_50.stream().count();
        int c6= (int) age_ab_50.stream().count();

        System.out.println("\nAge Group\tCount");
        System.out.println("======================");
        System.out.println("0-10\t\t"+c1);
        System.out.println("10-20\t\t"+c2);
        System.out.println("20-30\t\t"+c3);
        System.out.println("30-40\t\t"+c4);
        System.out.println("40-50\t\t"+c5);
        System.out.println("50+\t\t"+c6);
        
    }
    public static void mtOrNt(List<Passengers> passengers){
        if(passengers.size()==0)
        System.out.println("No Data Found");
        else
        System.out.println(passengers);
    }
}

class Passengers{
    private String name;
    private int age;
    Passengers(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "{name : '"+this.name+"', age : "+this.age+"}";
    }
}
