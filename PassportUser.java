public class PassportUser {

    private int passportId;
    private String name;
    private String country;
    private String dob;
    private String issueDate;
    private String expiryDate;
    private String status;

    public void setPassportId(int passportId){ this.passportId = passportId; }
    public int getPassportId(){ return passportId; }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setCountry(String country){ this.country = country; }
    public String getCountry(){ return country; }

    public void setDob(String dob){ this.dob = dob; }
    public String getDob(){ return dob; }

    public void setIssueDate(String issueDate){ this.issueDate = issueDate; }
    public String getIssueDate(){ return issueDate; }

    public void setExpiryDate(String expiryDate){ this.expiryDate = expiryDate; }
    public String getExpiryDate(){ return expiryDate; }

    public void setStatus(String status){ this.status = status; }
    public String getStatus(){ return status; }
}