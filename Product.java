public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Details: ID: " + id + " Name: " + name + " Price: " + price);
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Laptop", 75000);
        p.displayDetails();
    }
}
