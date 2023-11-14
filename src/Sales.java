import java.util.Date;

public class Sales {
    private String transactionNumber;
    private int quantity;
    private double amountDue;
    private Product product;
    private Employee employee;
    private Date transDate;

    public Sales(String transactionNumber, Employee employee, Product product, int quantity, Date transDate){
        this.transactionNumber = transactionNumber;
        this.employee = employee;
        this.product = product;
        this.quantity = quantity;
        this.transDate = transDate;
        this.product.setQuantitySold(this.product.getQuantitySold()+quantity);
        amountDue = product.getPrice()*quantity;
    }

    public int getAvailableStock(){
        return product.getStock()-product.getQuantitySold();
    }

    @Override
    public String toString() {
        return String.format("%-35s %-15s %-10s %-10s %-20s %-10.2f %-10.2f",
                transDate.toString(),
                transactionNumber,
                employee.getEmpId(),
                product.getProductId(),
                product.getProductName(),
                product.getPrice(),
                amountDue);
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getAmountDue() {
        return amountDue;
    }
    public Product getProduct() {
        return product;
    }
    public Employee getEmployee() {
        return employee;
    }
    public Date getTransDate() {
        return transDate;
    }
}
