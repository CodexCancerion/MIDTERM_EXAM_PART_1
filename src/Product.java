public class Product {
    private String productId, productName;
    private double price;
    private int stock, quantitySold;

    public Product (String productId, String productName, double price, int stock){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-10d %-10d", productName, getRemainingStock(), quantitySold);
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setQuantitySold(int quantitySold) {
        this.quantitySold += quantitySold;
    }
    public int getRemainingStock(){
        return stock-quantitySold;
    }
    public int getQuantitySold() {
        return quantitySold;
    }
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
}
