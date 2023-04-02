import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Products_contains_Tea {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product("Tea", 100, 120));
        products.add(new Product("Coffee", 100, 110));
        products.add(new Product("Green Tea", 75, 100));
        List<Product> filter_Tea=products.stream().filter(prdt->prdt.getName().contains("Tea")).collect(Collectors.toList());
        System.out.println(filter_Tea); 
        int totalTeaSales21=filter_Tea.stream().mapToInt(sale->sale.getSales21()).sum();
        int totalTeaSales22=filter_Tea.stream().mapToInt(sale->sale.getSales22()).sum();
        System.out.println("\nTotal Tea Sales in 2021 : "+totalTeaSales21);
        System.out.println("Total Tea Sales in 2022 : "+totalTeaSales22);

    }
}
class Product{
    private String name;
    private int sales21;
    private int sales22;
    Product(String name,int sales21,int sales22){
        this.name=name;
        this.sales21=sales21;
        this.sales22=sales22;
    }
    public String getName(){
        return name;
    }
    public int getSales21(){
        return sales21;
    }
    public int getSales22(){
        return sales22;
    }
    public String toString(){
        return "\n{Name : '"+this.name+"' , Sales21 : "+this.sales21+" ,Sales22 : "+this.sales22+"}";
    }
}
