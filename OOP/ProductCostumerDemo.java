package OOP;

public class ProductCostumerDemo {
     public static void main(String[] args) {

    Product p = new Product("P101", "Laptop", 55000, (short)2);
    Customer c = new Customer("C001", "Ankush", "Delhi", "9999999999");

    System.out.println("----- Product Details -----");
    System.out.println(p.getItemNo() + " | " +
                       p.getName() + " | " +
                       p.getPrice() + " | " +
                       p.getQuantity());

    System.out.println("\n----- Customer Details -----");
    System.out.println(c.getCustId() + " | " +
                       c.getName() + " | " +
                       c.getAddress() + " | " +
                       c.getPhno());
}
}
class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    
    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        this.name = name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}