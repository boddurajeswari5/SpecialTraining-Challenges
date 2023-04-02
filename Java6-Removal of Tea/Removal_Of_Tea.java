import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Sale {
    private String productName;
    private double price;

    public Sale(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Double.compare(sale.price, price) == 0 &&
                Objects.equals(productName, sale.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price);
    }
    public String toString(){
        return "["+this.productName+", "+this.price+"]";
    }
}
public class Removal_Of_Tea{
    public static void main(String[] args) {
        Set<Sale> sales = new HashSet<>();
        sales.add(new Sale("Coffee", 2.50));
        sales.add(new Sale("Tea", 1.75));
        sales.add(new Sale("Bread", 3.50));
        sales.add(new Sale("Milk", 1.25));
        System.out.println("Original set: " + sales);

        // Remove the sale with product name "Tea"
        Sale teaSale = new Sale("Tea", 1.75);
        boolean removed = sales.remove(teaSale);
        System.out.println("Removed sale with product name Tea: " + removed);
        System.out.println("Updated set: " + sales);
    }
}
