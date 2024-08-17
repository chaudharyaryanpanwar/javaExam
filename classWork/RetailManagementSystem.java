import java.util.List; 
import java.util.ArrayList; 
import java.time.LocalDate; 
public class Product{
  private int productID ; 
  private String productName ;
  private int companyID ;
  private double price ; 

  public Product(int productID , String productName , int companyID , double price){
    this.productID = productID ; 
    this.productName = productName ; 
    this.companyID = companyID ; 
    this.price = price ; 
  }

  public int getProductID() {
    return productID;
   }
  public void setProductID(int productID) { 
    this.productID = productID; 
  }
  public String getProductName() {
     return productName;
  }
  public void setProductName(String productName) { 
    this.productName = productName; 
  }
  public int getCompanyID() { 
    return companyID;
  }
  public void setCompanyID(int companyID) { 
    this.companyID = companyID; 
  }
  public double getPrice() { 
    return price; 
  }
  public void setPrice(double price) { 
    this.price = price; 
  }
}

public class Company{
  private int companyID ;
  private String companyName ; 
  
  public Company(int companyID , String companyName){
    this.companyID = companyID  ;
    this.companyName = companyName ; 
  }

  public int getCompanyID(){
    return companyID ; 
  }
  public void setCompanyID(int companyID){
    this.companyID = companyID ;
  }
  public String getCompanyName(){
    return companyName ; 
  }
  public void setCompanyName(String companyName){
    this.companyName = companyName ; 
  }
}

public class Customer{
  private int customerID ; 
  private String customerName ; 
  private List<Sale> purchaseHistory ;
  
  public Customer(int customerID , String customerName){
    this.customerID = cutomerID ; 
    this.customerName = customerName ; 
    this.purchaseHistory = new ArrayList<>() ; 
  }

  public int getCustomerID(){
    return customerID ; 
  }
  public void setCustomerID(int customerID){
    this.cutomerID = customerID ; 
  }
  public String getCustomerName(){
    return customerName ; 
  }
  public void setCustomerName(){
    this.customerName = customerName ; 
  }
  public List<Sale> getPurchaseHistory(){
    return purchaseHistory ; 
  }
  public void addPurchase(Sale sale){
    this.purchaseHistory.add(sale);
  }
}

public class Sale{
  private int salesID ; 
  private int productID ;
  private int customerID ; 
  private LocalDate date ; 
  private int quantity ;
  private double totalAmount ; 

  public Sale(int salesID , int productID , int customerID , LocalDate date, int quantity , double totalAmount){
    this.salesID = salesID ; 
    this.productID = productID ; 
    this.customerID = customerID ; 
    this.date = date ; 
    this.quantity = quantity ;
    this.totalAmount = totalAmount ; 
  }

  public int getSalesID() { 
    return salesID; 
  }
  public void setSalesID(int salesID) { 
    this.salesID = salesID; 
  }
  public int getProductID() { 
    return productID; 
  }
  public void setProductID(int productID) { 
    this.productID = productID; 
  }
  public int getCustomerID() { 
    return customerID; 
  }
  public void setCustomerID(int customerID) { 
    this.customerID = customerID; 
  }
  public LocalDate getDate() { 
    return date; 
  }
  public void setDate(LocalDate date) { 
    this.date = date; 
  }
  public int getQuantity() { 
    return quantity; 
  }
  public void setQuantity(int quantity) { 
    this.quantity = quantity; 
  }
  public double getTotalAmount() { 
    return totalAmount; 
  }
  public void setTotalAmount(double totalAmount) { 
    this.totalAmount = totalAmount; 
  }

}

public class Inventory{
  private int productID ; 
  private int quantity ; 

  public Inventory(int productID , int quantity){
    this.productID = productID ; 
  }
  public void setProductID(int productID) { 
    this.productID = productID; 
  }
  public int getQuantity() { 
    return quantity; 
  }
  public void setQuantity(int quantity) { 
    this.quantity = quantity; 
  }

}

public class Discount {
  private int discountID ;
  private int customerID ;
  private double discountPercentage ; 
  
  public int getDiscountID() { 
    return discountID; 
    }
  public void setDiscountID(int discountID) { 
    this.discountID = discountID; 
  }
  public int getCustomerID() { 
    return customerID; 
  }
  public void setCustomerID(int customerID) { 
    this.customerID = customerID; 
  }
  public double getDiscountPercentage() { 
    return discountPercentage; 
  }
  public void setDiscountPercentage(double discountPercentage) { 
    this.discountPercentage = discountPercentage; 
  }

}

public class RetailManagementSystem {
  import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company(1, "Company A");
        Company company2 = new Company(2, "Company B");

        Product product1 = new Product(1, "Product A", company1.getCompanyID(), 100.0);
        Product product2 = new Product(2, "Product B", company2.getCompanyID(), 150.0);
        Customer customer1 = new Customer(1, "Customer A");
        Customer customer2 = new Customer(2, "Customer B");
        Sale sale1 = new Sale(1, product1.getProductID(), customer1.getCustomerID(), LocalDate.now(), 2, 200.0);
        Sale sale2 = new Sale(2, product2.getProductID(), customer2.getCustomerID(), LocalDate.now(), 1, 150.0);
        customer1.addPurchase(sale1);
        customer2.addPurchase(sale2);
        Inventory inventory1 = new Inventory(product1.getProductID(), 50);
        Inventory inventory2 = new Inventory(product2.getProductID(), 30);
        Discount discount1 = new Discount(1, customer1.getCustomerID(), 10.0);
        Discount discount2 = new Discount(2, customer2.getCustomerID(), 15.0) ;
        System.out.println("Product 1: " + product1.getProductName() + ", Price: " + product1.getPrice());
        System.out.println("Product 1: " + product2.getProductName() + ", Price: " + product2.getPrice());

}