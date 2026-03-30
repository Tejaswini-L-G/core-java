public class SubscriptionDetails {

    private int subscriptionId;
    private String userName;
    private String planName;
    private double price;
    private String startDate;
    private String endDate;
    private String status;

    public void setSubscriptionId(int subscriptionId){ this.subscriptionId = subscriptionId; }
    public int getSubscriptionId(){ return subscriptionId; }

    public void setUserName(String userName){ this.userName = userName; }
    public String getUserName(){ return userName; }

    public void setPlanName(String planName){ this.planName = planName; }
    public String getPlanName(){ return planName; }

    public void setPrice(double price){ this.price = price; }
    public double getPrice(){ return price; }

    public void setStartDate(String startDate){ this.startDate = startDate; }
    public String getStartDate(){ return startDate; }

    public void setEndDate(String endDate){ this.endDate = endDate; }
    public String getEndDate(){ return endDate; }

    public void setStatus(String status){ this.status = status; }
    public String getStatus(){ return status; }
}