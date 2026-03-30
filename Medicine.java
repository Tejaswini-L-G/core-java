public class Medicine {

    private int medicineId;
    private String name;
    private String company;
    private double price;
    private String expiryDate;
    private String dosage;
    private String type;

    public void setMedicineId(int medicineId){ this.medicineId = medicineId; }
    public int getMedicineId(){ return medicineId; }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setCompany(String company){ this.company = company; }
    public String getCompany(){ return company; }

    public void setPrice(double price){ this.price = price; }
    public double getPrice(){ return price; }

    public void setExpiryDate(String expiryDate){ this.expiryDate = expiryDate; }
    public String getExpiryDate(){ return expiryDate; }

    public void setDosage(String dosage){ this.dosage = dosage; }
    public String getDosage(){ return dosage; }

    public void setType(String type){ this.type = type; }
    public String getType(){ return type; }
}