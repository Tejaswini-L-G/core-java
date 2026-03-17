class ZanduBalm {

    String brand;
    String type;
    double price;
    int quantity;
    String color;
    double weight;
    String manufacturer;
    String expiryDate;
    boolean isAvailable;
    String fragrance;
    String size;
    int rating;
    String origin;
    String usage;
    String packaging;
    String category;
    String batchNo;
    String shelfLife;
    String certification;
    String storage;

    // Default constructor → calls full constructor
    ZanduBalm() {
        this("Zandu", "Pain Relief", 120.5, 10, "Red", 50.0,
             "Zandu Pharma", "2026", true, "Strong",
             "Small", 5, "India", "External", "Box",
             "Healthcare", "B123", "2 years", "ISO", "Cool Place");

        System.out.println("Default Constructor Called");
    }

    // Full parameterized constructor
    ZanduBalm(String brand, String type, double price, int quantity,
              String color, double weight, String manufacturer,
              String expiryDate, boolean isAvailable, String fragrance,
              String size, int rating, String origin, String usage,
              String packaging, String category, String batchNo,
              String shelfLife, String certification, String storage) {

        this.brand = brand;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.isAvailable = isAvailable;
        this.fragrance = fragrance;
        this.size = size;
        this.rating = rating;
        this.origin = origin;
        this.usage = usage;
        this.packaging = packaging;
        this.category = category;
        this.batchNo = batchNo;
        this.shelfLife = shelfLife;
        this.certification = certification;
        this.storage = storage;
    }

    // Partial constructor → calls full constructor
    ZanduBalm(String brand, double price) {
        this(brand, "General", price, 5, "White", 40.0,
             "Zandu Pharma", "2025", true, "Mild",
             "Medium", 4, "India", "External", "Box",
             "Healthcare", "B456", "1 year", "ISO", "Room Temp");

        System.out.println("Partial Constructor Called");
    }

    void getDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry: " + expiryDate);
        System.out.println("Available: " + isAvailable);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Size: " + size);
        System.out.println("Rating: " + rating);
        System.out.println("Origin: " + origin);
        System.out.println("Usage: " + usage);
        System.out.println("Packaging: " + packaging);
        System.out.println("Category: " + category);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Shelf Life: " + shelfLife);
        System.out.println("Certification: " + certification);
        System.out.println("Storage: " + storage);
        System.out.println("----------------------------");
    }
}