class Camera {

    static String brandName;
    static String modelName;
    static String color;
    static String cameraType;
    static String lensType;
    static int megaPixel;
    static int zoomLevel;
    static int price;
    static int warrantyYears;
    static int storageCapacity;

    public static boolean createCamera(String brand, String model,
                                       String clr, String type,
                                       String lens, int mp,
                                       int zoom, int cost,
                                       int warranty, int storage) {

        boolean isCameraCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isColorValid = false;
        boolean isTypeValid = false;
        boolean isLensValid = false;
        boolean isMpValid = false;
        boolean isZoomValid = false;
        boolean isPriceValid = false;
        boolean isWarrantyValid = false;
        boolean isStorageValid = false;

        if (brand != null && !brand.isEmpty()) {
            brandName = brand;
            isBrandValid = true;
        } else {
            System.out.println("Brand name is required");
        }

        if (model != null && !model.isEmpty()) {
            modelName = model;
            isModelValid = true;
        } else {
            System.out.println("Model name is required");
        }

        if (clr != null && !clr.isEmpty()) {
            color = clr;
            isColorValid = true;
        } else {
            System.out.println("Color is required");
        }

        if (type != null && !type.isEmpty()) {
            cameraType = type;
            isTypeValid = true;
        } else {
            System.out.println("Camera type is required");
        }

        if (lens != null && !lens.isEmpty()) {
            lensType = lens;
            isLensValid = true;
        } else {
            System.out.println("Lens type is required");
        }

        if (mp > 0) {
            megaPixel = mp;
            isMpValid = true;
        } else {
            System.out.println("Invalid megapixel");
        }

        if (zoom > 0) {
            zoomLevel = zoom;
            isZoomValid = true;
        } else {
            System.out.println("Invalid zoom level");
        }

        if (cost > 0) {
            price = cost;
            isPriceValid = true;
        } else {
            System.out.println("Invalid price");
        }

        if (warranty > 0) {
            warrantyYears = warranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Invalid warranty");
        }

        if (storage > 0) {
            storageCapacity = storage;
            isStorageValid = true;
        } else {
            System.out.println("Invalid storage");
        }

        if (isBrandValid && isModelValid && isColorValid &&
            isTypeValid && isLensValid && isMpValid &&
            isZoomValid && isPriceValid &&
            isWarrantyValid && isStorageValid) {

            isCameraCreated = true;
        } else {
            System.out.println("Camera not created");
        }

        return isCameraCreated;
    }

    public static void getCameraDetails() {

        System.out.println("Camera Details:");

        System.out.println("Brand Name : " + brandName);
        System.out.println("Model Name : " + modelName);
        System.out.println("Color : " + color);
        System.out.println("Camera Type : " + cameraType);
        System.out.println("Lens Type : " + lensType);
        System.out.println("Megapixel : " + megaPixel);
        System.out.println("Zoom Level : " + zoomLevel);
        System.out.println("Price : " + price);
        System.out.println("Warranty Years : " + warrantyYears);
        System.out.println("Storage Capacity : " + storageCapacity);
    }
}