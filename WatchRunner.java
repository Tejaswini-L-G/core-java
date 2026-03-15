class WatchRunner {
    public static void main(String[] args) {

        Watch watch1 = new Watch(1901);
        System.out.println(watch1.watchId);

        Watch watch2 = new Watch("Fossil",1901);
        System.out.println(watch2.brand);

        Watch watch3 = new Watch("Gen6","Fossil");
        System.out.println(watch3.model);

        Watch watch4 = new Watch(22000.0,"Gen6");
        System.out.println(watch4.price);

        Watch watch5 = new Watch(7,22000.0);
        System.out.println(watch5.batteryDays);

        Watch watch6 = new Watch(50,7);
        System.out.println(watch6.waterResistance);

        Watch watch7 = new Watch("Brown",50);
        System.out.println(watch7.color);

        Watch watch8 = new Watch("Leather","Brown");
        System.out.println(watch8.strapMaterial);

        Watch watch9 = new Watch(44.0,"Leather");
        System.out.println(watch9.dialSize);

        Watch watch10 = new Watch(10,44.0);
        System.out.println(watch10.features);

        Watch watch11 = new Watch("USA",10);
        System.out.println(watch11.origin);

        Watch watch12 = new Watch(2,"USA");
        System.out.println(watch12.warranty);

    }
}
