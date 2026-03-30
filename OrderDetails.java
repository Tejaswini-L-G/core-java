public class OrderDetails {

    private int orderId;
    private String productName;
    private String customerName;
    private double price;
    private int quantity;
    private String orderDate;
    private String status;

    public void setOrderId(int orderId){ this.orderId = orderId; }
    public int getOrderId(){ return orderId; }

    public void setProductName(String productName){ this.productName = productName; }
    public String getProductName(){ return productName; }

    public void setCustomerName(String customerName){ this.customerName = customerName; }
    public String getCustomerName(){ return customerName; }

    public void setPrice(double price){ this.price = price; }
    public double getPrice(){ return price; }

    public void setQuantity(int quantity){ this.quantity = quantity; }
    public int getQuantity(){ return quantity; }

    public void setOrderDate(String orderDate){ this.orderDate = orderDate; }
    public String getOrderDate(){ return orderDate; }

    public void setStatus(String status){ this.status = status; }
    public String getStatus(){ return status; }
}