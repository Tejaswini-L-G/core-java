
class TediBarLotion {

    String brand;
    String type;
    String fragrance;
    String skinType;
    String packaging;
    String origin;
    String quality;
    String category;
    String texture;
    String color;

    int quantity;
    int rating;

    double price;
    double weight;

    boolean isMoisturizing;
    boolean isDermatTested;

    String expiry;
    String ingredients;
    String size;
    String usage;

    // Default constructor → calls full constructor
    TediBarLotion() {
        this("Tedibar", "Baby Lotion", "Mild", "Sensitive",
             "Bottle", "India", "Premium", "Skincare", "Smooth", "White",
             1, 5, 250.0, 200.0, true, true,
             "2026", "Milk Protein", "Medium", "Daily");

        System.out.println("Default Lotion Constructor Called");
    }

    // Full constructor
    TediBarLotion(String brand, String type, String fragrance, String skinType,
                  String packaging, String origin, String quality, String category,
                  String texture, String color, int quantity, int rating,
                  double price, double weight, boolean isMoisturizing,
                  boolean isDermatTested, String expiry, String ingredients,
                  String size, String usage) {

        this.brand = brand;
        this.type = type;
        this.fragrance = fragrance;
        this.skinType = skinType;
        this.packaging = packaging;
        this.origin = origin;
        this.quality = quality;
        this.category = category;
        this.texture = texture;
        this.color = color;
        this.quantity = quantity;
        this.rating = rating;
        this.price = price;
        this.weight = weight;
        this.isMoisturizing = isMoisturizing;
        this.isDermatTested = isDermatTested;
        this.expiry = expiry;
        this.ingredients = ingredients;
        this.size = size;
        this.usage = usage;
    }

    // Partial constructor
    TediBarLotion(String brand, double price) {
        this(brand, "Body Lotion", "Soft", "All Skin",
             "Tube", "India", "Good", "Skincare", "Light", "Cream",
             1, 4, price, 150.0, true, true,
             "2025", "Aloe Vera", "Small", "Daily");

        System.out.println("Partial Lotion Constructor Called");
    }

    void getDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Price: " + price);
        System.out.println("----------------------------");
    }
}