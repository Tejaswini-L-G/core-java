public class LoanApplication {

    private int applicationId;
    private String applicantName;
    private double loanAmount;
    private String loanType;
    private String bankName;
    private String status;
    private String appliedDate;

    public void setApplicationId(int applicationId){ this.applicationId = applicationId; }
    public int getApplicationId(){ return applicationId; }

    public void setApplicantName(String applicantName){ this.applicantName = applicantName; }
    public String getApplicantName(){ return applicantName; }

    public void setLoanAmount(double loanAmount){ this.loanAmount = loanAmount; }
    public double getLoanAmount(){ return loanAmount; }

    public void setLoanType(String loanType){ this.loanType = loanType; }
    public String getLoanType(){ return loanType; }

    public void setBankName(String bankName){ this.bankName = bankName; }
    public String getBankName(){ return bankName; }

    public void setStatus(String status){ this.status = status; }
    public String getStatus(){ return status; }

    public void setAppliedDate(String appliedDate){ this.appliedDate = appliedDate; }
    public String getAppliedDate(){ return appliedDate; }
}